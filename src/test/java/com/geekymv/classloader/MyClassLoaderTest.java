package com.geekymv.classloader;

import com.geekymv.jvm.classloader.MyClassLoader;
import org.junit.Test;

public class MyClassLoaderTest {

    @Test
    public void test() throws Exception {
        MyClassLoader loader = new MyClassLoader("loader1");
        loader.setPath("C:/Users/Administrator/Desktop/");

        Class clazz = loader.loadClass("com.geekymv.java8.Student");

        System.out.println(clazz.getClassLoader());
    }

}
