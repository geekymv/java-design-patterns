package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;

/**
 * 排序数组中下标从p到r之间的一组数据，
 * 选择p到r 之间的任意一个数据作为pivot（分区点）。
 *
 * 遍历p到r 之间的数据，将小于pivot 的放到左边，将大于pivot 放到右边，将pivot 放到中间。
 */
public class QuickSort {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int p, int r) {
        if(p >= r) {
            return;
        }
        int q = partition(arr, p, r);
        quickSort(arr, p, q-1);
        quickSort(arr, q+1, r);
    }

    /**
     * 选择分区点
     * 原地分区函数
     * 通过游标i把A[p, r]分成两部分，A[p, i-1]都小于pivot，A[p, i-1] 已处理区间，A[i, r] 未处理区间。
     * 每次从未处理区间A[i, r] 取一个元素A[j]与pivot 对比，如果小于pivot 则将其加入到已处理区间的尾部，也就是A[i]的位置。
     *
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private int partition(int[] arr, int p, int r) {
        // 选择A[p, r]的最后一个元素作为pivot
        int pivot = arr[r];
        int i = p;
        for(int j = p; j < r; j++) {
            if(arr[j] < pivot) {
                Util.swap(arr, i, j);
                i = i + 1;
            }
        }

        // 将pivot 放在中间
        Util.swap(arr, i, r);
        return i;
    }



}


