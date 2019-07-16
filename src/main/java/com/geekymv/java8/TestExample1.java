package com.geekymv.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 Stream<String[]>		-> flatMap ->	Stream<String>
 Stream<Set<String>>	-> flatMap ->	Stream<String>
 Stream<List<String>>	-> flatMap ->	Stream<String>
 Stream<List<Object>>	-> flatMap ->	Stream<Object>
 */
public class TestExample1 {

    @Test
    public void test01() {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        /*
        Stream<String[]> temp = Arrays.stream(data); // Stream<String[]>

        Stream<String> stream = temp.flatMap(x-> Arrays.stream(x)) // Stream<String>
                                    .filter(x -> "a".equals(x.toString()));
        stream.forEach(System.out::println);
        */

        Arrays.stream(data).flatMap(x-> Arrays.stream(x))
                .filter(x-> "a".equals(x.toString()))
                .forEach(System.out::println);

    }
}
