package com.geekymv.designpatterns.proxy.cglib;

/**
 * 具体主题角色（被代理角色）
 *
 */
public class RealSubject {

    public String foo(String foo) {
        System.out.println("real subject foo " + foo);
        return "foo, " + foo;
    }

    public String request(String name) {
        System.out.println("real subject request " + name);
        return "hello, " + name;
    }
}
