package com.yundun.proxy.statics;

import com.yundun.proxy.trends.PersonInvocation;
import com.yundun.proxy.trends.PersonProxy;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 静态代理总结:
 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 2.缺点:

 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 如何解决静态代理中的缺点呢?答案是可以使用动态代理方式
 */
public class App {

    public static void main(String[] args) {
        /*PersonDao personDao = new PersonDao();
        PersonDaoProxy personDaoProxy = new PersonDaoProxy(personDao);
        personDaoProxy.update();*/

        IPersonDao ipe = new PersonDao();
        PersonInvocation pi = new PersonInvocation(ipe);
        PersonProxy pp = new PersonProxy(pi);
        IPersonDao kjhk = (IPersonDao) pp.getPersonProxy();

        kjhk.update();




    }
}
