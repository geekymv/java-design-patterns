package com.geekymv.datastruct;

import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayQueueTest {

    private static ArrayQueue queue;

    @BeforeClass
    public static void before() {
        queue = new ArrayQueue(3);
    }


    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.list();
    }


    @Test
    public void testDeQueue() {
        for(int i = 0; i < 10; i++) {
            Integer item = queue.dequeue();
            System.out.println(item);
        }
    }

}
