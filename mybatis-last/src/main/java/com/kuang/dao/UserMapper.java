package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();

    @Select("select * from user where id = #{id}}")
    User getUserById(@Param("id") int id, @Param("name") String name); // 传递参数用@Param注解不论一个还是多个

    @Update("update user set name=#{name},pwd=#{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
