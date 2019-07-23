package com.geekymv.classloader;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClassLoaderTest {

    @Test
    public void test() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("hello.conf");

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        inputStream.close();
    }

}
