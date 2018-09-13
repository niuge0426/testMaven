package com.yundun.proxy.statics;

public class PersonDao implements IPersonDao {
    @Override
    public void update() {
        System.out.println("修改个人信息");
    }
}
