package com.geekymv.designpatterns.factory;

/**
 * 具体产品角色
 */
public class ProductA implements IProduct {

    @Override
    public void print() {
        System.out.println("product A");
    }
}
