package com.gl.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 5, 2, 6, 9, 7, 7, 7, 7, 7, 7, 7, 7};
        System.out.println(majorityElement(ints));

//        Map <Integer,String> integerStringMap= new HashMap<>();
//        integerStringMap.put(5,"five");
//        integerStringMap.put(3,"forth");
//        integerStringMap.put(6,"six");
//        integerStringMap.s
//        System.out.println(integerStringMap);












    }

    static public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        Map<String, Integer> map = new HashMap();
        int apearChampion = 0;
        for (int i = 0; i < nums.length; i++) {
            String currentKey = nums[i] + "";
            if (map.containsKey(currentKey)) {
                map.put(currentKey, (map.get(currentKey) + 1));
            } else map.put(currentKey, 1);

            if (map.get(currentKey) > apearChampion && map.get(currentKey) > (nums.length / 2)) {
                apearChampion =  Integer.valueOf(currentKey);

            }


        }
        return apearChampion;
    }
}
