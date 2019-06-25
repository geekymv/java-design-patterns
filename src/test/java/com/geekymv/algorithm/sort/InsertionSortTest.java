package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testSort() {
        InsertionSort sort = new InsertionSort();
        int arr[] = {2, 1, 5, 4, 6, 2, 0};

        sort.sort(arr);

        Util.print(arr);
    }
}
