package com.geekymv.designpatterns.factory.simplefactory;

import com.geekymv.designpatterns.factory.IProduct;
import com.geekymv.designpatterns.factory.ProductA;
import com.geekymv.designpatterns.factory.ProductB;

/**
 * 工厂类角色
 */
public class SimpleFactory {

    public IProduct produce(String type) {
        if("ProductA".equals(type)) {
            return new ProductA();
        }
        else if("ProductB".equals(type)) {
            return new ProductB();
        }
        else {
            System.out.println("类型type不正确");
            return null;
        }
    }
}
