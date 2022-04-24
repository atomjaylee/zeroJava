package com.atom.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 编码过滤器
 */
public class characterEncodingFilter implements Filter {
    @Override
    // 该过滤器的初始化
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("编码过滤器开启");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        System.out.println("编码过滤器执行");
        // 对链进行放行，方便下一个过滤器执行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    // 该过滤器的销毁
    public void destroy() {
        System.out.println("编码过滤器销毁");
    }
}
