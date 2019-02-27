package com.liuxscomp.filter;

import com.liuxscomp.bo.UserOrganizationPlatformBo;
import com.liuxscomp.common.constant.PlatformConstant;
import com.liuxscomp.common.constant.RedisKeyConstant;
import com.liuxscomp.service.RedisService;
import com.liuxscomp.service.UserOrganizationPlatformService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PlatformAuthFilter implements Filter {

    //过期时间 分钟
    private static final Long EXPIRE_TIME = 10L;
    private static final TimeUnit TIME_UNIT = TimeUnit.MINUTES;
    private String[] excludedUris;
    private RedisService redisService;
    private UserOrganizationPlatformService userOrganizationPlatformService;
    private static final String REDIRECT_URL = "/physique/login/no-platform-permission";
    private static final String ORGANIZATION_ID = "organizationId";

    public PlatformAuthFilter(RedisService redisService, UserOrganizationPlatformService userOrganizationPlatformService) {
        this.redisService = redisService;
        this.userOrganizationPlatformService = userOrganizationPlatformService;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        excludedUris = filterConfig.getInitParameter("excludedUri").split(",");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest res = (HttpServletRequest) request;
        if (!"OPTIONS".equals(res.getMethod())) {
            String uri = res.getServletPath();
            if (isExcludedUri(uri)) {
                chain.doFilter(request, response);
            } else {
                //判断用户是否具有该平台的登录权限
                Map<String, String> userInfo = (Map) request.getAttribute("userInfo");
                String platformKey = userInfo.get("platformKey");
                if (!PlatformConstant.PHYSIQUE_PLATFORM.equals(platformKey)) {
                    request.getRequestDispatcher(REDIRECT_URL).forward(request, response);
                    return;
                }
                //缓存中获取用户信息
                long userId = Long.parseLong(userInfo.get("userId"));
                Map userInfoMap =
                        redisService.getValue(RedisKeyConstant.PHYSIQUE_SGW_USERINFO_KEY_PREFIX + String.valueOf(userId));
                if (userInfoMap == null) {
                    //获取用户组织id等信息放入userInfo中
                    long platformId = Long.parseLong(userInfo.get("platformId"));
                    List<UserOrganizationPlatformBo> list =
                            userOrganizationPlatformService.findAvailableByPlatformIdAndUserId(platformId, userId);
                    if (list.isEmpty()) {
                        request.getRequestDispatcher(REDIRECT_URL).forward(request, response);
                        return;
                    }
                    userInfoMap = new HashMap();
                    userInfoMap.put(ORGANIZATION_ID, list.get(0).getOrganizationId().toString());
                    redisService.setValue(RedisKeyConstant.PHYSIQUE_SGW_USERINFO_KEY_PREFIX + String.valueOf(userId),
                            userInfoMap, EXPIRE_TIME, TIME_UNIT);
                    userInfo.put(ORGANIZATION_ID, list.get(0).getOrganizationId().toString());
                } else {
                    if (userInfoMap.get(ORGANIZATION_ID) == null) {
                        redisService.delValue(RedisKeyConstant.PHYSIQUE_SGW_USERINFO_KEY_PREFIX + String.valueOf(userId));
                        request.getRequestDispatcher(REDIRECT_URL).forward(request, response);
                        return;
                    }
                    userInfo.put(ORGANIZATION_ID, userInfoMap.get(ORGANIZATION_ID).toString());
                }
                request.setAttribute("userInfo", userInfo);
                chain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {
        excludedUris = null;
    }

    private boolean isExcludedUri(String uri) {
        if (excludedUris == null || excludedUris.length <= 0) {
            return false;
        }
        for (String ex : excludedUris) {
            uri = uri.trim();
            ex = ex.trim();
            if (uri.toLowerCase().matches(ex.toLowerCase().replace("*", ".*")))
                return true;
        }
        return false;
    }
}
