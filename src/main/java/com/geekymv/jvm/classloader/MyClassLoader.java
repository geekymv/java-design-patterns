package com.geekymv.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {

    // 自定义类加载器名称
    private String loaderName;

    // 类路径
    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public MyClassLoader(String loaderName) {
        this.loaderName = loaderName;
    }

    public MyClassLoader(ClassLoader parent, String loaderName) {
        super(parent);
        this.loaderName = loaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {
        name = name.replace(".", "/");
        ByteArrayOutputStream baos = null;
        FileInputStream fis = null;

        System.out.println("classLoader name is " + loaderName + ", class name is " + name);

        try {
            baos = new ByteArrayOutputStream();
            fis = new FileInputStream(new File(path + name + ".class"));
            int len = 0;
            while((len = fis.read()) != -1) {
                baos.write(len);
            }
            return baos.toByteArray();

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
