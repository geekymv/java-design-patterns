package com.geekymv.designpatterns.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK的动态代理依靠接口实现，如果有些类并没有实现接口，则不能使用JDK动态代理。
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        SubjectA subject = (SubjectA) new JdkProxy().newProxyInstance(realSubject);
        System.out.println(subject.getClass().getName());
        subject.foo("zhangsan");

        // 查看代理类源码
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", realSubject.getClass().getInterfaces());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("E:/data/Proxy.class"));
            fos.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        SubjectB subjectA = (SubjectB) new JdkProxy().newProxyInstance(realSubject);
        subjectA.request("test");
    }

}
