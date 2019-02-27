package com.liuxscomp.common.filter;

import org.apache.catalina.servlet4preview.GenericFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */
public class CorsFilter extends GenericFilter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin,X-Requested-With,Content-Type,Accept,Authorization,Client-Type");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(200);
            return;
        } else {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void destroy() {

    }
    public void init(FilterConfig filterConfig) {}

}
