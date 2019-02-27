package com.geekymv.designpatterns.proxy.staticproxy;

public class ProxyTest {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
