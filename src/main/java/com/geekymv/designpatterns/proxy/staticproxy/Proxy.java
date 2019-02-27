package com.geekymv.designpatterns.proxy.staticproxy;

/**
 * 代理主题角色，也叫代理类。
 * 代理对象内部含有目标对象的引用，从而可以在任何时候操作目标对象。
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("proxy request");
        subject.request();
    }
}
