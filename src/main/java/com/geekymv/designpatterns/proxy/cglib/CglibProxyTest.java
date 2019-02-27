package com.geekymv.designpatterns.proxy.cglib;

public class CglibProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = (RealSubject)new CglibProxy().getInstance(new RealSubject());
        realSubject.foo("test");
    }
}
