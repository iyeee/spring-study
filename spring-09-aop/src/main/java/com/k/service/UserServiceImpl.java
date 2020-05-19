package com.k.service;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
