package com.yundun.threadpool;

public interface AbstractStorage {

    void consume(int num);
    void produce(int num);
}
