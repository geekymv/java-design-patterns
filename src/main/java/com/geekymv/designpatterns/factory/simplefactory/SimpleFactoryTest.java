package com.geekymv.designpatterns.factory.simplefactory;

import com.geekymv.designpatterns.factory.IProduct;

/**
 * https://blog.csdn.net/u013256816/article/details/50975438
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        IProduct product = simpleFactory.produce("ProductA");
        product.print();

        product = simpleFactory.produce("ProductB");
        product.print();
    }
}
