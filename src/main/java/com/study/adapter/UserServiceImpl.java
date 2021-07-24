package com.study.adapter;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public String getUserName() {
        return userDao.getName();
    }
}
