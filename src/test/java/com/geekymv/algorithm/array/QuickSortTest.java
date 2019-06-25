package com.geekymv.algorithm.array;

import com.geekymv.algorithm.Util;
import com.geekymv.algorithm.sort.QuickSort;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testSort() {
        QuickSort quickSort = new QuickSort();
        int arr[] = {2, 1, 5, 4, 6, 2, 0};
        quickSort.sort(arr);

        Util.print(arr);
    }
}
