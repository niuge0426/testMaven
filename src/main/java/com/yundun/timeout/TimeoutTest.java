package com.yundun.timeout;

import java.util.Random;
import java.util.concurrent.*;

public class TimeoutTest {

    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        String result = timeoutMethod(5000);
        System.out.println("方法实际耗时：" + (System.currentTimeMillis() - start) + "毫秒");
        System.out.println("结果：" + result);

        try {
            Thread.sleep(2000);
            long start1 = System.currentTimeMillis();
            String result1 = timeoutMethod(5000);
            System.out.println("方法实际耗时：" + (System.currentTimeMillis() - start1) + "毫秒");
            System.out.println("结果：" + result1);
        } catch (Exception e) {
            // TODO: handle exception
        }
        executorService.shutdown();
    }

    /**
     * 有超时时间的方法
     * @param timeout
     * @return
     */
    private static String timeoutMethod(int timeout) {
        String result = "默认";
        FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {

            public String call() throws Exception {
                return unknowMethod();
            }
        });

        executorService.execute(futureTask);
        try {
            result = futureTask.get(timeout, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            System.out.println("走超时了");
            futureTask.cancel(true);
            result = "默认";
        }

        return result;
    }

    /**
     * 这个方法的耗时不确定
     * @return
     */
    private static String unknowMethod() {
        Random random = new Random();
        int time = (random.nextInt(10) + 1) * 1000;
        System.out.println("任务将耗时： " + time + "毫秒");
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "获得方法执行后的返回值";
    }
}
