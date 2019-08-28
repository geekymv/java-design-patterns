package com.geekymv.designpatterns.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTestMain {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.geekymv.designpatterns.annotation.MyCat");
            Object o = clazz.newInstance();

            Method[] methods = clazz.getDeclaredMethods();

            for(Method m : methods) {
                if(m.isAnnotationPresent(MyTest.class)) {
                    try {
                        m.invoke(o);

                    } catch (IllegalAccessException e) {
                        System.out.println("error1 " + e.getCause());
                    } catch (InvocationTargetException e) {
                        Throwable ex = e.getCause();
                        Class<? extends Exception> exc = m.getAnnotation(MyTest.class).value();

                        if(exc.isInstance(ex)) {
                            System.out.println("测试成功");
                        }else {
                            System.out.println("测试失败");
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("error3 = " + e.getCause());
        }


    }

}
