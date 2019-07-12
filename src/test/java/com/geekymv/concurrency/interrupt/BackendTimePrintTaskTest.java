package com.geekymv.concurrency.interrupt;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class BackendTimePrintTaskTest {

    @Test
    public void test() {
        BackendTimePrintTask backendTimePrintTask = new BackendTimePrintTask();
        backendTimePrintTask.run();

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        backendTimePrintTask.cancel();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
