package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();     // 获取所有用户
    List<User> getUserListByLimit(Map<String, Integer> map);
}
