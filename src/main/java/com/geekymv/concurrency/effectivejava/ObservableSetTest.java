package com.geekymv.concurrency.effectivejava;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableSetTest {

    public static void main(String[] args) {

        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer e) {
                System.out.println(e);
                if(e == 23) {
                    SetObserver observer = this;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    try {
                        System.out.println("线程1 = " + Thread.currentThread().getName());

                        executor.submit(()-> {
                            System.out.println("线程2 = " + Thread.currentThread().getName());
                            boolean b = set.removeObserver(observer);
                            System.out.println("删除结果 = " + b);
                        }).get(); // get 方法 等待计算结果

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    } finally {
                        executor.shutdown();
                    }
                }
            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }

    }
}
