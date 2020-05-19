package com.kuang.service;

import com.kuang.dao.UserDao;

public class UserServiceUmpl2 {
    private UserDao userDao;
    public UserServiceUmpl2(){
        System.out.println("222");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
