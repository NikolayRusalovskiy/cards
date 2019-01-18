package com.gl.interwievtask;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arrInts = {5, 8, 15, 20, 10};
        System.out.println(Arrays.toString(twoSum(arrInts, 15)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        for (int i = 0; i < (nums.length - 1); i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return result;
    }

}
