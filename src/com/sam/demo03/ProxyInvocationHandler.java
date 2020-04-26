package com.sam.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//这个类用于自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
   private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }



    // 处理代理实例 并返回 结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理干活前夹带
        seeHouse();
        Object result = method.invoke(rent, args);
        //代理干活后夹带
        charge();
        return result;
    }


    public void seeHouse(){
        System.out.println("代理带看房子");
    }

    public void charge(){
        System.out.println("收中介费");
    }
}
