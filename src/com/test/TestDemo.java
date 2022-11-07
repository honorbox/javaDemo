package com.test;

import com.bean.User;

public class TestDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setUname("张三");
        user.setPassword("123456");
        System.out.println("User:"+ user);
    }
}
