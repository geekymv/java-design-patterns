package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;

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

    private int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for(int j = p; j < r; j++) {
            if(arr[j] < pivot) {
                Util.swap(arr, i, j);
                i = i + 1;
            }
        }
        Util.swap(arr, i, r);
        return i;
    }



}


