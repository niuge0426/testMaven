package com.yundun.proxy.trends3;

public class App {

    public static void main(String[] args) {
        Xx xx = new XxImpl();
        XxInvocationHandler handler = new XxInvocationHandler(xx);
        Xx xx2 = (Xx) ProxyContainer.createProxy(xx, handler);
        xx2.say("jhgbjmn");

    }
}
