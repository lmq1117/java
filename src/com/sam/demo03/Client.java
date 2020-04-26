package com.sam.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        HouseOwner houseOwner = new HouseOwner();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口
        pih.setRent(houseOwner);

        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();


        //
    }
}
