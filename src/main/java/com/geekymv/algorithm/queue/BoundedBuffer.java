package com.geekymv.algorithm.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {

    private List items = new ArrayList<>();

    private int size;

    public BoundedBuffer(int size) {
        this.size = size;
    }

    private ReentrantLock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public void put(Object item) {
        lock.lock();
        try {
            while (size == items.size()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 队列满了等待");
                    notFull.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            items.add(item);

            notEmpty.signalAll();

        }finally {
            lock.unlock();
        }
    }

    public Object take() {
        lock.lock();
        try {
            while (0 == items.size()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 队列为空等待");
                    notEmpty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object item = items.remove(0);
            notFull.signalAll();
            return item;

        }finally {
            lock.unlock();
        }
    }

}
