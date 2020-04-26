package com.sam.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //userService.add();

        // 需求 每一个方法增加 日志功能
        // 不改动原有代码 不改变原有业务的情况下 可以使用代理模式
        //让代理去做
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }

}
