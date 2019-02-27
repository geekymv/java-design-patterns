package com.geekymv.designpatterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * https://blog.csdn.net/u013256816/article/details/51009592
 */
public class CglibProxy implements MethodInterceptor{

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;

        Enhancer enhancer = new Enhancer();
        // 设置要创建动态代理的类
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("====== cglib proxy invoke ======");
        System.out.println("obj = " + obj.getClass().getName());

//        Object result = proxy.invokeSuper(obj, args);
        Object result = proxy.invoke(target, args);

        System.out.println("real object invoke finished result = " + result);

        return null;
    }
}
