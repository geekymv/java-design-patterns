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

    public int searchByRecursive(int[] arr, int value) {
        return search(arr, value, 0, arr.length-1);
    }

    /**
     * 二分查找递归实现
     * @param arr
     * @param value
     * @param low
     * @param high
     * @return
     */
    private int search(int[] arr, int value, int low, int high) {
        if(low > high) { // 终止条件
            return -1;
        }
        int mid = low + ((high - low) / 2);
        if(arr[mid] == value) {
            return mid;
        }else if(arr[mid] > value) {
            high = mid - 1;
        }else {
            low = mid + 1;
        }
        return search(arr, value, low, high);
    }


}
