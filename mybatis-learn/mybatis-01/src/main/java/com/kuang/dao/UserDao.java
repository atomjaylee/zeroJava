package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询所有的用户
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    // 插入用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除一个用户
    int deleteUser(int id);

    // ------------- Map方式 ---------------
    int addUserByMap(Map<String, Object> map);              // 通过map来新增用户

    List<User> getUserListByMap(Map<String, Object> map);   // 通过map来查询用户

}
