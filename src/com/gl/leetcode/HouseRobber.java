package com.gl.leetcode;

public class HouseRobber {
    /*
    You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
     */


    public static void main(String[] args) {
        int[] ints = new int[]{4, 7, 5, 6,1,5,4,2,6,4,1};
        System.out.println(rob(ints));

    }

    static public int rob(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int pre2 = i - 2 < 0 ? 0 : nums[i - 2];
            int pre3 = i - 3 < 0 ? 0 : nums[i - 3];
            nums[i] = Math.max(pre2, pre3) + nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }
}
