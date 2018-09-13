package com.yundun.spi;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@SPI("dubbo")
public interface ISayName {
    void say();





    @Adaptive
    <T> Exporter<T> export(Invoker<T> invoker) throws RpcException;
}
