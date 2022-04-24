package com.kuang.service;

import com.kuang.dao.MySqlImpl;
import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    // 如果现在我们不是用UserDaoImpl,而使用新建的MysqlImpl，则就需要动态修改这实例化的类了，代码耦合
    // UserDao userDao = new UserDaoImpl();
    // UserDao userDao = new MySqlImpl();

    /**
     * 这里引入IOC的概念
     * 既然UserDao的指向是上述代码的经常变动点，那我们直接将其声明为内部变量，
     * 具体用谁不在本类中判断了，将决定权上交，从调用利用多态，动态传入目标
     *
     * 简单说就是，对于经常变换的dao层，利用动态传入决定用谁，就像函数内部不知道用哪个，那就由参数决定
     */

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 用户实际调用的是业务层，dao层他们不需要接触
    public void userInfo() {
        userDao.getUser();
    }
}
