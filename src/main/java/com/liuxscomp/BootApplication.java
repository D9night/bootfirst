package com.liuxscomp;

import com.liuxscomp.common.filter.CorsFilter;
import com.liuxscomp.common.filter.OpsJwtFilter;
import com.liuxscomp.filter.PlatformAuthFilter;
import com.liuxscomp.service.RedisService;
import com.liuxscomp.service.UserOrganizationPlatformService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan("com.liuxscomp.dao")
public class BootApplication {

    @Resource
    private RedisService redisService;

    @Resource
    private UserOrganizationPlatformService userOrganizationPlatformService;

    private static String excludedUriStr = "/version,/physique/login/*,/refresh-token/*,/hospital/common/*"
            + ",*.js,*.gif,*.jpg,*.png,*.css,*.ico";

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }


    @Bean
    public FilterRegistrationBean filterCorsRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CorsFilter corsFilter = new CorsFilter();
        registrationBean.setFilter(corsFilter);
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        OpsJwtFilter jwtFilter = new OpsJwtFilter();
        registrationBean.setFilter(jwtFilter);
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(2);
        registrationBean.addInitParameter("excludedUri", excludedUriStr);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterUserAuthBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(platformAuthFilter());
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        registrationBean.setOrder(3);
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.addInitParameter("excludedUri", excludedUriStr);
        return registrationBean;
    }

    @Bean
    public PlatformAuthFilter platformAuthFilter() {
        return new PlatformAuthFilter(redisService, userOrganizationPlatformService);
    }
}
