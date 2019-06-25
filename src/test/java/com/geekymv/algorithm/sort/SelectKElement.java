package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;
import org.junit.Test;

/**
 * O(n)时间复杂度内
 * 求无序数组中第K大元素
 */
public class SelectKElement {

    @Test
    public void testSelectK() {
        int arr[] = {6, 2, 3, 0, 7, 10, 9, 8};
        int select = select(arr, 3);

        System.out.println(select);
    }

    public int select(int[] arr, int k) {
        return selectK(arr, 0, arr.length - 1, k);
    }

    private int selectK(int[] arr, int p, int r, int k) {
        int q = partition(arr, p, r);
        if(q+1 == k) {
            return arr[q];
        }
        if(k > q+1) {
            return selectK(arr, q+1, r, k);
        }
        return selectK(arr, 0, q-1, k);
    }

    /**
     * 分区
     * 左边的元素大于 pivot ，右边的元素小于pivot
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for(int j = p; j < r; j++) {
            if(arr[j] > pivot) {
                Util.swap(arr, i, j);
                i = i + 1;
            }
        }
        Util.swap(arr, i, r);
        return i;
    }



}
