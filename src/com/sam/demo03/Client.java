package com.sam.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        HouseOwner houseOwner = new HouseOwner();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口
        //代理谁
        pih.setRent(houseOwner);

        //获得代理类 动态生成的  并没有手写
        Rent proxy = (Rent)pih.getProxy();

        //让代理去干活
        proxy.rent();


        //
    }
}
