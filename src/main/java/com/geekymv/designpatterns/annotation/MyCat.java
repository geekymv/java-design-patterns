package com.geekymv.designpatterns.annotation;

public class MyCat {

    @MyTest(IndexOutOfBoundsException.class)
    public void testA() {
        int[] arr = new int[1];
        int i = arr[2];
        System.out.println(i);
    }

}
