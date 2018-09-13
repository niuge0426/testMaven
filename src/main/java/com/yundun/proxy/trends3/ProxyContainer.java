package com.yundun.proxy.trends3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyContainer {

    public static Object createProxy(Object proxyed, InvocationHandler ih){
        return Proxy.newProxyInstance(ih.getClass().getClassLoader(),
                proxyed.getClass().getInterfaces(), ih);
    }
}
