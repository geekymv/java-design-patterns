package com.geekymv.algorithm.array;

public class MyArray {
    // 保存数据
    private int[] arr;

    // 元素个数
    private int size;

    // 数组长度
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
        checkIndex(index);
        if(size == len) {
            return false;
        }
        // 数据搬移，index及其之后的数据都要向后移动一位
        for(int i = size - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        return true;
    }

    public int remove(int index) {
        checkIndex(index);
        int value = arr[index];
        if(index != size - 1) {
            // 如果不是移除最后一个元素，则需要将index之后的元素向前移动一位
            for(int i = index + 1; i < size; i++) {
                arr[i-1] = arr[i];
            }
        }
        size--;
        return value;
    }

    public void checkIndex(int index) {
        if(index < 0 || index > len-1) {
            throw new IllegalArgumentException("参数index异常");
        }
    }

    /**
     * 打印数组内容
     */
    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
