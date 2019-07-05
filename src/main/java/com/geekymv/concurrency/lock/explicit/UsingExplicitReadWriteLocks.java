package com.geekymv.concurrency.lock.explicit;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * 允许多个线程同时读，只能有一个写。
 *
 * 读访问被授权，如果没有写或写请求处理。
 * 写访问被授权，如果没有读。
 *
 */
public class UsingExplicitReadWriteLocks {

    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    /**
     * 读锁
     */
    private ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();

    /**
     * 写锁
     */
    private ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();

    private String myContent = "A long default content ...";

    public String showContent() {
        readLock.lock();

        try {
            System.out.println("read lock");
            return myContent;

        }finally {
            readLock.unlock();
        }
    }

    public void writeContent(String newContent) {
        writeLock.lock();

        try {
            System.out.println("write lock " + newContent);
            myContent = myContent + newContent;

        }finally {
            writeLock.unlock();
        }
    }



}
