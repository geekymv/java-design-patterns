package com.geekymv.algorithm.leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintInOrder {


}


class Foo {

    private ReentrantLock lock = new ReentrantLock();

    private Condition firstCondition = lock.newCondition();
    private Condition secondCondition = lock.newCondition();
    private Condition thirdCondition = lock.newCondition();




    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}