package com.geekymv.concurrency.synchronizer;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 可以实现让一组线程等待至某个状态之后，再全部同时执行。
 */
public class UsingBarriers {

    public static final int TASK_NUM = 10;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Runnable barrierAction = ()-> {
            System.out.println("大家都到齐了，开始执行");
        };

        CyclicBarrier barrier = new CyclicBarrier(TASK_NUM, barrierAction);

        Runnable task = ()-> {
            try {
                System.out.println("准执行任务 " + Thread.currentThread().getName());
                // 大家在这集合
                barrier.await();

                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10) * 100);
                System.out.println("任务执行完成 " + Thread.currentThread().getName());

            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        for(int i = 0; i < TASK_NUM; i++) {
            executorService.execute(task);
        }

        executorService.shutdown();
    }

}
