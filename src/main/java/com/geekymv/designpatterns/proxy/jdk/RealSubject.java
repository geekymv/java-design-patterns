package com.geekymv.designpatterns.proxy.jdk;

/**
 * 具体主题角色（被代理角色）
 *
 */
public class RealSubject implements SubjectA, SubjectB {

    @Override
    public String foo(String foo) {
        System.out.println("real subject foo " + foo);
        return "foo, " + foo;
    }

    @Override
    public String request(String name) {
        System.out.println("real subject request " + name);
        return "hello, " + name;
    }
}
