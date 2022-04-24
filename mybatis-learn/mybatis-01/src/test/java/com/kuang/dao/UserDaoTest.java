package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getUserList() {
        // 通过工具类获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行， 方式一： 获取mapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        // 执行 方式二
        // List<User> userList1 = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User targetUser = mapper.getUserById(1);
        System.out.println(targetUser);

        sqlSession.close();
    }

    // 增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.addUser(new User(1, "Mybatis", "123321"));
        if (res > 0) {
            System.out.println("插入数据成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int res = mapper.updateUser(new User(4, "webpack", "111111"));
        if (res > 0) {
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int res = mapper.deleteUser(4);
        if (res > 0) System.out.println("删除成功");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUserByMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 4);
        map.put("userName", "rollup");
        map.put("password", "123123");
        int res = mapper.addUserByMap(map);
        if (res > 0) System.out.println("新增成功");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserListByMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 1);
        map.put("userName", "vue");
        List<User> list = mapper.getUserListByMap(map);

        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
