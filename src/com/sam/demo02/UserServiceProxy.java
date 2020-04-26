package com.sam.demo02;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    //spring 不建议这么做 建议用set方法
    //public UserServiceProxy(UserServiceImpl userService) {
    //    this.userService = userService;
    //}


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("delete");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }


    //日志方法
    private void log(String message) {
        System.out.println("[Debug]:使用了" + message + "方法");
    }
}
