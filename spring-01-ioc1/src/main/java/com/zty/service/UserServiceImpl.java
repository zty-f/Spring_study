package com.zty.service;

import com.zty.dao.UserDao;
import com.zty.dao.UserDaoImpl;
import com.zty.dao.UserDaoMysqlImpl;
import com.zty.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao ;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser() {
     userDao.getUser();
    }


}
