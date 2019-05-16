package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;

/**
 * 选择排序
 * 将待排序区间分未已排序区间和未排序区间
 * 从未排序区间找到最小的元素，将其放到已排序区间的末尾
 *
 * 已排序区间 未排序区间
 *
 * 选择排序是一种不稳定的排序算法
 */
public class SelectionSort {

    public void sort(int[] arr) {
        int len = arr.length;
        if(len <= 1) {
            return;
        }

        for(int i = 0; i < len; i++) {
            int minIndex = i; // 最小值索引
            for(int j = i + 1; j < len; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            System.out.println(arr[i] + " 交换 " + arr[minIndex]);
            Util.swap(arr, i, minIndex);
            Util.print(arr);
        }
    }
}
