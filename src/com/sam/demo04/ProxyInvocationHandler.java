package com.sam.demo04;

import com.sam.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口 代理谁
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //动态生成代理类的对象
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    //执行代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //log("add"); 写死
        //反射是万能的 获取方法名
        log(method.getName());

        Object result = method.invoke(target,args);
        return result;
    }


    public void log(String msg){
        System.out.println("调用了" + msg + "方法");
    }
}
