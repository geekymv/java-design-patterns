package com.geekymv.algorithm.sort;

import com.geekymv.algorithm.Util;

public class CountSort {

    public void sort(int[] arr) {
        int max = 0;
        for(int i = 0, len = arr.length; i < len; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int[] level = new int[max+1];

        // 计算每个值的个数，level数组下标为值，数组值对应个数
        for(int i = 0, len = arr.length; i < len; i++) {
            int score = arr[i];
            level[score] = level[score] + 1;
        }
        Util.print(level);

        // 依次累加
        for(int i = 1, len = level.length; i < len; i++) {
            level[i] = level[i] + level[i-1];
        }
        Util.print(level);

        int[] temp = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--) {
            int score = arr[i]; // 学生成绩
            int index = level[score]; // <=socre 成绩的个数
            temp[index-1] = score; // 将学生成绩放入临时数组对应位置中
            level[score] = level[score] - 1; // <=socre 成绩的个数值减1
        }

        Util.print(temp);

        // 将结果拷贝给arr
        for(int i = 0, len = temp.length; i < len; i++) {
            arr[i] = temp[i];
        }

        Util.print(arr);
    }

}
