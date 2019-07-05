package com.geekymv.concurrency.lock.intrinsic;

/**
 * 每个Java对象有一个内置锁（或监视器锁 monitor lock）和它关联。
 *
 * 每个Java对象可以被用作一个锁。
 *
 * 内置锁是互斥的，因此同一时刻只有一个线程可以在使用同步机制时持有锁。
 *
 * 当同步方法或同步块结束时锁被释放。
 *
 * 同步可以对锁定的内容进行顺序访问，并保证内存可见性，以便将同步范围内发生的更改通知到所有线程。
 *
 * 内置锁是可重入锁，如果一个线程持有它，你可以再次获取到锁，而不会死锁。
 */
public class UsingIntrinsicLocks {

    private boolean state;

    /**
     * 在方法签名使用synchronized ，synchronized 使用this 作为锁。
     * 除了this，其他对象也可以用作锁。
     */
    public synchronized void mySynchronizedMethod() {
        state = !state;
        // 在这个方法里，只可以被持有这个锁的线程访问。
        System.out.println("My state is:" + state);

        // 没用使用 synchronized，state 不能保证顺序，可能是 true, true, false, true...
        // 使用 synchronized，总是输出 true, false, true, false...
    }

}
