package com.yundun.proxy.statics;

public class PersonDaoProxy implements IPersonDao {

    private IPersonDao iPersonDao;

    public PersonDaoProxy(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    public void update() {
        System.out.println("修改个人信息前记录日志");
        this.iPersonDao.update();
        System.out.println("修改个人信息后记录日志");
    }
}
