package com.geekymv.algorithm.array;

import org.junit.Test;

public class MyArrayTest {

    @Test
    public void testAdd() {
        MyArray array = new MyArray(3);
        array.add(1);
        array.add(0, 2);

        array.add(2, 4);

        array.print();
    }
}
