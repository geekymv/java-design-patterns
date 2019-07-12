package com.geekymv.concurrency.interrupt;

import java.util.concurrent.TimeUnit;

public class InterruptTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
            while (true) {
                if(Thread.interrupted()) {
                    System.out.println("线程被中断");
                    break;
                }
                System.out.println("................");
            }
        });
        t1.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 中断 t1线程
        t1.interrupt();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("主线程结束");
    }

}
