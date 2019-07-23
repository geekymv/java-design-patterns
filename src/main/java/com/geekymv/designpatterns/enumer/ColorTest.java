package com.geekymv.designpatterns.enumer;

import org.junit.Test;

import java.util.Locale;

public class ColorTest {

    @Test
    public void testValueOf() {
        Color red = Color.valueOf("red".toUpperCase(Locale.ENGLISH));
        System.out.println(red);
    }

}
