package com.geekymv.designpatterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

    private Object realObject;

    public Object newProxyInstance(Object realObject) {
        this.realObject = realObject;
        Class<?> clazz = this.realObject.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====== jdk proxy invoke ======");

        String className = method.getDeclaringClass().getName();
        String name = method.getName();
        System.out.println("class name = " + className + "method name = " + name);

//        Class<?>[] parameterTypes = method.getParameterTypes();
//        Class<?> clazz = this.realObject.getClass();
//        Method m = clazz.getMethod(name, parameterTypes);
//        m.invoke(realObject, args);

        Object result = method.invoke(realObject, args);

        System.out.println("real object invoke finished result = " + result);

        return null;
    }
}
