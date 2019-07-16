package com.geekymv.algorithm.query;

/**
 * 针对是是一个有序集合
 */
public class BinarySearch {

    public int search(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
//            int mid = (low + high) / 2;
            int mid = low + ((high - low) / 2);
            if(arr[mid] == value) {
                return mid;
            }else if(arr[mid] > value) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
