package com.geekymv.concurrency.interrupt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BackendTimePrintTask {

    // 运行线程
    private Thread thread;

    // 定义任务
    private Runnable task = ()-> {

      while (!Thread.currentThread().isInterrupted()) {
          Date now = new Date();
          System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now));

          try {
              TimeUnit.SECONDS.sleep(1);
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          }
      }

      System.out.println("任务被取消");

    };

    /**
     * 运行
     */
    public void run() {
        thread = new Thread(task);
        thread.start();
    }

    /**
     * 取消
     */
    public void cancel() {
        if(thread != null) {
            thread.interrupt();
        }
    }

}


