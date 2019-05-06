package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;

/**
 * 冒泡排序
 * 冒泡排序只会操作两个相邻的数据，每次冒泡操作都会对相邻的两个元素进行比较。
 * 看是否满足大小关系需求，如果不满足就交换。
 * 一次冒泡会让至少一个元素移动到它应该在的位置，重复n次，就完成了n个数据的排序工作。
 *
 * 优化：当某次冒泡操作已经没有数据交换时，说明已经达到完全有序，不用再执行后续的冒泡操作。
 */
public class BubbleSort {

    public void sort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            // 是否有数据交换的标志
            boolean flag = false;
            for(int j = 0; j < len - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    flag = true;
                }
            }

            Util.print(arr);

            if(!flag) {
                break;
            }
        }

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
