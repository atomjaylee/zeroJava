package com.atom.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream resource = this.getServletContext().getResourceAsStream("WEB-INF/classes/db.properties");
        Properties prop = new Properties();
        prop.load(resource);

        String userName = prop.getProperty("userName");
        String password = prop.getProperty("password");


        resp.getWriter().print(userName + ":" + password);
    }
}
