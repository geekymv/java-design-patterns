package com.geekymv.concurrency;

import com.geekymv.concurrency.lock.explicit.UsingExplicitReadWriteLocks;
import org.junit.Test;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExplicitReadWriteLocksTest {

    @Test
    public void test() {
        UsingExplicitReadWriteLocks readWriteLocks = new UsingExplicitReadWriteLocks();

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i++) {
            executor.submit(()-> {
                try {
                    // Delay readers to start
                    Thread.sleep(new Random().nextInt(10) * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(readWriteLocks.showContent());
            });
        }

        for (int i = 0; i < 5; i++) {
            executor.execute(() -> readWriteLocks.writeContent(UUID.randomUUID().toString()));
        }

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

}
