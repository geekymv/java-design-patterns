package com.geekymv.algorithm.queue;

public class BoundedBufferTest {

    public static void main(String[] args) {

        BoundedBuffer buffer = new BoundedBuffer(100);

        for (int i = 0; i < 2; i++) {
            new Thread(()-> {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Object item = buffer.take();
                    System.out.println(Thread.currentThread().getName() + " 获取元素" + item);
                }

            }, "thread-" + i).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(()-> {
                while (true) {
                    buffer.put( Math.random() * 100);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

}
