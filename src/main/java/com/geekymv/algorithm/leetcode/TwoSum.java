package com.geekymv.algorithm.leetcode;

import java.util.Arrays;

/**
 *
 https://leetcode.com/problems/two-sum/

 1. Two Sum

 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 ```text
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 ```
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0, len = nums.length; i < len - 1; i++) {
            for(int j = i + 1;  j < len; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    // 测试
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1, 2, 3, 5, 6, 8, 9};
        int target = 17;

        int[] result = twoSum.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
