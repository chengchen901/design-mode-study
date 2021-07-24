package com.study.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        String userName = userService.getUserName();
        System.out.println(userName);
    }
}
