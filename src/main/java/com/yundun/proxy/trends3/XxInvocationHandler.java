package com.yundun.proxy.trends3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class XxInvocationHandler implements InvocationHandler {

    private Object xxProxyed;

    public XxInvocationHandler(Object xxProxyed) {
        this.xxProxyed = xxProxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("处理之前");
        Object invoke = method.invoke(xxProxyed, args);
        System.out.println("处理之后");


        return invoke;
    }
}
