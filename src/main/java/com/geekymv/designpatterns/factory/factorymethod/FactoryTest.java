package com.geekymv.designpatterns.factory.factorymethod;

import com.geekymv.designpatterns.factory.IProduct;

public class FactoryTest {

    public static void main(String[] args) {
        IFactory factory = new FactoryA();
        IProduct product = factory.produce();
        product.print();

        factory = new FactoryB();
        product = factory.produce();
        product.print();
    }

}
