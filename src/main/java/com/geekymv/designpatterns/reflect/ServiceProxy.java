package com.geekymv.designpatterns.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Object[] parameters = args;


        System.out.println("className = " + className + ", methodName = "
                + methodName + ", parameterTypes = " + parameterTypes + ", parameters = " + parameters);

        return null;
    }
}
