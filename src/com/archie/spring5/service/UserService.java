package com.archie.spring5.service;

import com.archie.spring5.dao.UserDao;
import com.archie.spring5.dao.UserDaoImpl;

public class UserService {

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    public void add() {
        System.out.println("add..........");
//        UserDao dao = new UserDaoImpl();
//        dao.update();
        userDao.update();
    }
}
