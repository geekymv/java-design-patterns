package com.geekymv.designpatterns.reflect;


import java.lang.reflect.Proxy;

public class ProxyFactory<T> {

    private Class<T> iface;

    public ProxyFactory() {
    }
    public ProxyFactory(Class<T> iface) {
        this.iface = iface;
    }

    public Class<T> getIface() {
        return iface;
    }
    public void setIface(Class<T> iface) {
        this.iface = iface;
    }

    public T newInstance() {
        // 创建代理对象
        return (T)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{iface}, new ServiceProxy());
    }
}
