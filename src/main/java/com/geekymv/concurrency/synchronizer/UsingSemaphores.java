package com.geekymv.concurrency.synchronizer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Semaphore 信号量 是一个同步对象。
 * 用来控制同时访问特定资源的线程数量
 * 比如高速公路要限制流量，只允许同时100 辆车在这条公路上行驶，其他的都必须在路口等待。
 * 如果100辆车有5辆车已经离开了公路，那么后面就允许有5辆车驶入公路。
 *
 * 这里的车可以类比线程，驶入公路表示线程在执行。
 *
 */
public class UsingSemaphores {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Semaphore semaphore = new Semaphore(3);

        Runnable r = ()-> {
            try {

                if(semaphore.tryAcquire(2, TimeUnit.SECONDS)) {
                    System.out.println("Acquired - " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    System.out.println("Done - " + Thread.currentThread().getName());
                }

            }catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        };

        for(int i = 0; i < 10; i++) {
            executor.execute(r);
        }

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

}
