package com.geekymv.algorithm.leetcode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * https://leetcode.com/problems/print-foobar-alternately/
 */
public class PrintFoobarAlternately {

    public static void main(String[] args) {

        FooBar fooBar = new FooBar(200);

        final Runnable printFoo = ()-> {
            System.out.print("foo");
        };

        Runnable printBar = ()-> {
            System.out.print("bar\n");
        };

        Thread t1 = new Thread(()-> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()-> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();
//        t1.start();

    }

}


class FooBar {
    private int n;

    ReentrantLock lock = new ReentrantLock();

    Condition fooCondition = lock.newCondition();

    Condition barCondition = lock.newCondition();

    boolean foo = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (foo) {
                    fooCondition.await();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();

                barCondition.signal();
                foo = true;

            }finally {
                lock.unlock();
            }

        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (!foo) {
                    barCondition.await();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();

                fooCondition.signal();
                foo = false;

            }finally {
                lock.unlock();
            }

        }
    }
}