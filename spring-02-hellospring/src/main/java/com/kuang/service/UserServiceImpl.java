package com.kuang.service;

import com.kuang.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public UserServiceImpl(){
        System.out.println("UserServiceImpl Construtor");
    }
    public void getUser() {
        userDao.getUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
