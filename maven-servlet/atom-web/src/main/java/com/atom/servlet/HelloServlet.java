package com.atom.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取ServletContext对象
        ServletContext servletContext = this.getServletContext();

        // 设置值
        String userName = "只要学不死, 就往死里学";
        servletContext.setAttribute("userName", userName);

        // 获取值
        System.out.println(servletContext.getAttribute("userName"));

        PrintWriter writer = resp.getWriter();
        writer.print("hello Servlet" + servletContext.getInitParameter("url") + "你好");
    }
}
