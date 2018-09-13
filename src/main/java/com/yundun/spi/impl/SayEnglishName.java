package com.yundun.spi.impl;

import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.yundun.spi.ISayName;

public class SayEnglishName implements ISayName {
    public void say() {
        System.out.println("Toby");
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }
}
