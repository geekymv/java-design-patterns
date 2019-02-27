package com.geekymv.designpatterns.proxy.staticproxy;

/**
 * 具体主题角色（被代理角色）
 *
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("real subject request");
    }
}
