package com.geekymv.designpatterns.factory.factorymethod;

import com.geekymv.designpatterns.factory.IProduct;
import com.geekymv.designpatterns.factory.ProductB;

public class FactoryB implements IFactory {

    @Override
    public IProduct produce() {
        return new ProductB();
    }
}
