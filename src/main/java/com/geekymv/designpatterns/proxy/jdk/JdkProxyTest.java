package com.geekymv.designpatterns.proxy.jdk;

public class JdkProxyTest {

    public static void main(String[] args) {

        SubjectB subject = (SubjectB) new JdkProxy().newProxyInstance(new RealSubject());
        subject.request("zhangsan");


        SubjectA subjectA = (SubjectA) new JdkProxy().newProxyInstance(new RealSubject());
        subjectA.foo("test");
    }

}
