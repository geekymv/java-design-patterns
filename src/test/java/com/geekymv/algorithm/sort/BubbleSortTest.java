package com.geekymv.algorithm.sort;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort sort = new BubbleSort();
        int[] arr = {1, 2, 3, 4, 6, 5};
        sort.sort(arr);
    }

}
