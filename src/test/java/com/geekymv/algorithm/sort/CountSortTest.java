package com.geekymv.algorithm.sort;

import org.junit.Test;

public class CountSortTest {

    @Test
    public void sort() {
        CountSort sort = new CountSort();
        int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};
        sort.sort(arr);
    }

}
