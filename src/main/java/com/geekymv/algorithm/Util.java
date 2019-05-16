package com.geekymv.algorithm;

public class Util {

    /**
     * 打印数组内容
     */
    public static void print(int[] arr) {
        for(int i = 0, len = arr.length; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 交换数据
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
