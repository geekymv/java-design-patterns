package com.geekymv.algorithm.array;

import org.junit.Test;

public class MyArrayTest {

    @Test
    private void testAdd() {
        MyArray array = new MyArray(3);
        array.add(1);
        array.add(0, 2);

        array.add(2, 4);

        array.print();
    }

    @Test
    public void testRemove() {
        MyArray array = new MyArray(3);
        array.add(1);
        array.add(2);
        array.add(3);
        array.print();

        int value = array.remove(2);
        System.out.println("移除的元素 value = " + value);
        array.print();
    }
}
