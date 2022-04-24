package com.kuang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String  id;
    private String title;
    private String author;
    private Date createTime; // 和数据库列名不一致，可通过mybatis的驼峰配置
    private int views;
}
