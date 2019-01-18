package com.gl.leetcode;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 2, 1};
        System.out.println(singleNumber(numbers));


    }

    static public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) set.remove(nums[i]);
        }
        return set.iterator().next();
    }
}
