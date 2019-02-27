package com.liuxscomp.common.filter;

import com.liuxscomp.common.utils.JwtUtil;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class OpsJwtFilter extends GenericFilterBean {

    private String[] excludedUris;


//    public void init(FilterConfig filterConfig) throws ServletException {
//        excludedUris = filterConfig.getInitParameter("excludedUri").split(",");
//    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest res = (HttpServletRequest) servletRequest;
        if (!"OPTIONS".equals(res.getMethod())) {
            String uri = res.getServletPath();
            if (isExcludedUri(uri)) {
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                HttpServletRequest request = (HttpServletRequest) servletRequest;
                HttpServletResponse response = (HttpServletResponse) servletResponse;
                String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
                request.setAttribute("basePath", basePath);

                //客户端将token封装在请求头中，格式为（Bearer后加空格）：Authorization：Base +token
                final String authHeader = request.getHeader("Authorization");
                if (authHeader == null || !authHeader.startsWith("Base ")) {
                    response.setStatus(401);
                    response.getWriter().append("unauthorized");
                    return;
                }
                //去除Bearer 后部分
                final String token = authHeader.substring(5);
                try {
                    request.setAttribute("token", token);
                    Long userId = JwtUtil.getUserId(token);
                    request.setAttribute("userId", userId);
                    Map userMap = JwtUtil.getUserInfo(token);
                    request.setAttribute("userInfo",userMap);
                }catch (ExpiredJwtException e){
                    servletRequest.getRequestDispatcher("/refresh-token/refresh").forward(request, response);
                    return;
                } catch (final Exception e) {
                    log.error("jwt解析错误：" + ExceptionUtils.getStackTrace(e));
                    response.setStatus(401);
                    response.getWriter().append("Invalid token");
                    return;
                }
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
    }
    @Override
    public void destroy() {
        excludedUris=null;
    }

    private boolean isExcludedUri(String uri) {
        if (excludedUris == null || excludedUris.length <= 0) {
            return false;
        }
        for (String ex : excludedUris) {
            uri = uri.trim();
            ex = ex.trim();
            if (uri.toLowerCase().matches(ex.toLowerCase().replace("*",".*")))
                return true;
        }
        return false;
    }
}
