package com.geekymv.concurrency.synchronizer;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 门闩
 * 可以实现类似计数器的功能
 * 一般用于某个线程A等待若干个其他线程执行完任务之后，它才执行。
 */
public class UsingLatches {

    public static final int TASK_NUM = 10;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 指定count 值
        CountDownLatch latch = new CountDownLatch(TASK_NUM);

        Runnable task = ()-> {
            try {
                // 模拟任务执行耗费时间至多1s
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10) * 100);
                System.out.println("任务执行完成 " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 任务执行完成，count减1
                latch.countDown();
            }
        };

        for(int i = 0; i < TASK_NUM; i++) {
            executorService.execute(task);
        }

        try {
            latch.await();
            System.out.println("所有任务执行完成");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }

}
