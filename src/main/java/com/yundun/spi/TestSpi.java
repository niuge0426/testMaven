package com.yundun.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.yundun.schema.People;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestSpi {

//    private static final ISayName iSayName = ExtensionLoader.getExtensionLoader(ISayName.class).getAdaptiveExtension();

    @Test
    public void test(){


        /*ServiceLoader<ISayName> loaders = ServiceLoader.load(ISayName.class);

        for (ISayName sayName : loaders) {
            sayName.say();
        }*/


        /*ConcurrentMap<String,String> map = new ConcurrentHashMap<String, String>();

        String s = map.putIfAbsent("qwd", "FASSF");
        System.out.println(s);
        String s1 = map.putIfAbsent("qwd", "654");
        System.out.println(s1);*/

        People people = new People();
        if(people instanceof People){
            System.out.println("klk");
        }

        /*ServiceConfig<ISayName> service = new ServiceConfig<ISayName>();

        System.out.println(service.getInterfaceClass());*/


    }
}
