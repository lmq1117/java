package com.sam.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();

        // 需求 每一个方法增加 日志功能
        // 不改动原有代码
    }

}
