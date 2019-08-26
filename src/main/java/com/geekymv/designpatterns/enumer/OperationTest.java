package com.geekymv.designpatterns.enumer;

import org.junit.Test;

public class OperationTest {

    @Test
    public void testDivide() {
        double result = Operation.DIVIDE.apply(12, 3);
        System.out.println(result);
    }

}
