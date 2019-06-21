package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;

/**
 * 归并排序
 * p...r = (p, q) + (q+1, r)
 */
public class MergeSort {

    public void sort(int[] arr) {
        int len = arr.length;
        mergeSort(arr, 0, len - 1);
    }

    public void mergeSort(int[] arr, int p, int r) {
//        for(int i = p; i <= r; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

        // 递归终止条件
        if(p >= r) {
            return;
        }
        // 取 p 到 r 之间的中间位置
        int q = (p + r) / 2;
        // 分治递归
        mergeSort(arr, p, q);
        mergeSort(arr, q + 1, r);
        System.out.println("=================================");

        // 合并数据
        merge(arr, p, q, r);
    }


    /**
     * arr[p, r] = arr[p, q] + arr[q+1, r]
     * @param arr
     * @param p 第一个数组的起始下标
     * @param q 第一个数组的终止下标
     * @param r 第二个数组的终止下标
     */
    public void merge(int arr[], int p, int q, int r) {
        int[] temp = new int[r-p+1]; // 申请一个和arr[p, r] 长度一样的数组
        int i = p;
        int j = q+1;
        int k = 0;

        // 把 arr[p, q] 和 arr[q+1, r] 中较小的数添加到temp中
        while(i <=q && j <= r) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        // 将左边剩余的数据拷贝到temp
        while (i <= q) {
            temp[k++] = arr[i++];
        }
        // 将右边剩余的数据拷贝到temp
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        // 将temp 数组中的数据拷贝到arr
        for(int m = 0, len = temp.length; m < len; m++) {
            arr[p+m] = temp[m];
        }
    }

}
