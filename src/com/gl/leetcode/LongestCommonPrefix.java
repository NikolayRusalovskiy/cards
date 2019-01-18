package com.gl.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"aa","a"};
        System.out.println(longestCommonPrefix(strings));
    }

    static public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) return result;
        a:
        for (int i = 0; i < strs[0].length(); i++) {
            char character = strs[0].charAt(i);
            for (String s : strs
            ) {
                if (s.length() < (i+1) )break a;
                if (s.charAt(i) != character) break a;
            }
            result += character;
        }
        return result;
    }
}
