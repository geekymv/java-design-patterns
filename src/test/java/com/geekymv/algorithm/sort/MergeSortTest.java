package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testSort() {
        MergeSort mergeSort = new MergeSort();

        int arr[] = {2, 1, 5, 4, 6, 2, 0};

        mergeSort.sort(arr);

        System.out.println("=========================");

        Util.print(arr);
    }
}
