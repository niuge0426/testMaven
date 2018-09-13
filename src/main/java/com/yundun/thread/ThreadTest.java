package com.yundun.thread;

public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 0){
                Thread myThread1 = new MyThread();
                Thread myThread2 = new MyThread();
                myThread1.start();
                myThread2.start();
            }
        }
    }
}
