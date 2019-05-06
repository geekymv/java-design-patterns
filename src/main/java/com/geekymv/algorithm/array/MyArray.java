package com.geekymv.algorithm.array;

public class MyArray {

    private int[] arr;

    private int size;

    private int len;

    public MyArray(int n) {
        this.len = n;
        this.arr = new int[n];
    }


    public int size() {
        return size;
    }

    /**
     * 添加数据
     * @param value
     * @return
     */
    public boolean add(int value) {
        if(size == len) {
            return false;
        }
        arr[size] = value;
        size++;
        return true;
    }

    public boolean add(int index, int value) {
        if(index < 0 || index > len-1) {
            throw new IllegalArgumentException("参数index异常");
        }
        if(size == len) {
            return false;
        }
        // 数据搬移，index及其之后的数据都要向后移动一位
        for(int i = size-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;

        return true;
    }

    /**
     * 打印数组内容
     */
    public void print() {
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
