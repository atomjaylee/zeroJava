package com.atom.servlet;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 配置信息
        String url = "jdbc:mysql://localhost:3306/kuang?useUnicode=true&characterEncoding=utf-8";
        String name = "root";
        String password = "jj19910626";

        //1. 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. 连接数据库
        Connection connection = DriverManager.getConnection(url, name, password);

        //3. 创建向数据库发SQL的对象 Statement
        Statement statement = connection.createStatement();

        //4. 编写SQL
        String sql = "select * from users";

        //5. 执行SQL，返回ResultSet
        ResultSet resultSet = statement.executeQuery(sql);

//        while (resultSet.next()){
//            System.out.println("id="+resultSet.getObject("id"));
//            System.out.println("name="+resultSet.getObject("name"));
//            System.out.println("pasword="+resultSet.getObject("pasword"));
//            System.out.println("email="+resultSet.getObject("email"));
//            System.out.println("birthday="+resultSet.getObject("birthday"));
//        }

        // 6.关闭连接 - 释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
