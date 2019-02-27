package com.geekymv.designpatterns.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        productA.produceA();
        productB.produceB();


        factory = new ConcreteFactory2();
        productA = factory.createProductA();
        productB = factory.createProductB();

        productA.produceA();
        productB.produceB();
    }

}
