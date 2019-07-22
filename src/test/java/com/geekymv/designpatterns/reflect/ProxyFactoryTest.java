package com.geekymv.designpatterns.reflect;

import org.junit.Test;

public class ProxyFactoryTest {

    @Test
    public void test() {
        ProxyFactory<HelloService> proxyFactory = new ProxyFactory<>(HelloService.class);
        HelloService helloService = proxyFactory.newInstance();

        String result = helloService.sayHello("张三");
        System.out.println("result = " + result);
    }
}
