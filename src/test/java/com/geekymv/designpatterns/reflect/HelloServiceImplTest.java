package com.geekymv.designpatterns.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class HelloServiceImplTest {

    @Test
    public void test01() throws Exception {
        // 通过反射获取类的class对象
        Class<?> clazz = Class.forName("com.geekymv.designpatterns.reflect.HelloServiceImpl");
        // 创建类的实例
        Object object = clazz.newInstance();
        // 获取method 对象
        Method method = clazz.getMethod("sayHello", new Class[]{String.class});
        // 调用方法
        Object result = method.invoke(object, new Object[]{"张三"});
        System.out.println(result);
    }

    @Test
    public void test02() throws Exception {
        // 通过反射获取类的class对象
        Class<?> clazz = Class.forName("com.geekymv.designpatterns.reflect.HelloServiceImpl");
        // 创建类的实例
        Object object = clazz.newInstance();
        // 获取method 对象
        Method method = clazz.getMethod("sayHello", new Class[]{String.class});
        System.out.println(method.getDeclaringClass());

        method = clazz.getMethod("toString", new Class[]{});
        // getDeclaringClass
        System.out.println(method.getDeclaringClass());
    }
}
