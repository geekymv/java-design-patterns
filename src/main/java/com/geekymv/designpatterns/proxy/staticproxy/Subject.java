package com.geekymv.designpatterns.proxy.staticproxy;

/**
 * 抽象主题角色
 * 目标对象和代理对象的共同接口，这样任何使用目标对象的地方都可以使用代理对象
 */
public interface Subject {

    public void request();
}
