package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSort() {
        SelectionSort selectionSort = new SelectionSort();
        int arr[] = {2, 1, 5, 4, 6, 2, 0};
        selectionSort.sort(arr);

        Util.print(arr);
    }
}
