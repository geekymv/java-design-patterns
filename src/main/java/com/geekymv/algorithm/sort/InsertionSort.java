package com.geekymv.algorithm.sort;

/**
 * 将待排序的数组分为已排序区间，未排序区间，初始已排序区间只有一个元素，就是数组的第一个元素。
 * 插入排序的核心思想就是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入。
 * 并保证已排序区间数据一直有序，重复这个过程直到未排序区间中元素为空，算法结算。
 */
public class InsertionSort {

    public void sort(int[] arr) {
        int len = arr.length;
        if(len <= 1) {
            return;
        }

        // 未排序区间
        for(int i = 1; i < len; i++) {
            int value = arr[i];

            // 已排序区间，查找插入的位置
            int j = i - 1;
            for(;j >= 0; j--) {
                if(arr[j] < value) {
                    // 找到插入位置j+1
                    break;
                }else {
                    arr[j+1] = arr[j]; // 数据移动
                }
            }
            // 插入数据
            arr[j+1] = value;
        }
    }


}
