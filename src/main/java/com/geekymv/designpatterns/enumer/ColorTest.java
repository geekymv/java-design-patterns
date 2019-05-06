package com.geekymv.designpatterns.enumer;

import org.junit.Test;

public class ColorTest {

    @Test
    public void testValueOf() {
        Color red = Color.valueOf("red".toUpperCase());
        System.out.println(red);
    }

}
