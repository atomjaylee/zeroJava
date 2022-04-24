package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> res = mapper.getUserList();
        for (User user : res) System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserListByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> params = new HashMap<String, Integer>();
        params.put("startIndex", 0);
        params.put("pageSize", 6);
        List<User> userList = mapper.getUserListByLimit(params);
        for (User user : userList) System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void log4jTest() {
        logger.info("INFO: 这是info信息");
        logger.debug("DEBUG: 这是debug信息");
        logger.error("ERROR: 这是错误信息");
    }
}
