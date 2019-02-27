package com.geekymv.designpatterns.factory.factorymethod;

import com.geekymv.designpatterns.factory.IProduct;
import com.geekymv.designpatterns.factory.ProductA;

public class FactoryA implements IFactory {

    @Override
    public IProduct produce() {
        return new ProductA();
    }
}
