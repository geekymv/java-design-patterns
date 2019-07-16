package com.geekymv.algorithm.query;

/**
 * 二分查找类似分治思想
 *
 * 使用条件
 * 1.顺序表，即数组
 * 2.有序数据
 *
 * 时间复杂度O(logn)
 */
public class BinarySearch {

    public int search(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) { // 循环退出条件
//            int mid = (low + high) / 2; // low+high 有可能会溢出
            int mid = low + ((high - low) / 2); // mid 取值
            if(arr[mid] == value) {
                return mid;
            }else if(arr[mid] > value) {
                high = mid - 1; // 更新high
            }else {
                low = mid + 1; // 更新low
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
