package com.geekymv.designpatterns.proxy.cglib;

/**
 * cglib 是针对类来实现的，它的原理是对指定的目标类生成一个子类，并覆盖其中的方法(非final的public类型)实现增强。
 * 因为采用的是继承，所以不能对final修饰的类进行代理。
 *
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = (RealSubject)new CglibProxy().getInstance(new RealSubject());
        realSubject.foo("test");
    }
}
