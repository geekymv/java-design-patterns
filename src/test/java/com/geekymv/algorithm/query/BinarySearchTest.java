package com.geekymv.algorithm.query;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test() {
        BinarySearch search = new BinarySearch();

        int[] arr = {1, 3, 5, 6, 9, 10, 14, 22};

        int index = search.search(arr, 14);
        System.out.println(index);
    }
}
