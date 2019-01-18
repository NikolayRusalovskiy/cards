package com.gl.leetcode;

public class JewelsandStones {
    public static void main(String[] args) {
//        Input:
//        J = "aA", S = "aAAbbbb"
//        Output:
//        3
        String j = "aA";
        String s = "aAAbbbb";
        System.out.println(numJewelsInStones(j, s));
    }

    static public int numJewelsInStones(String j, String s) {
        int result = 0;
        if (j.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (j.indexOf(current)!=-1) {
                result++;
            }
        }
        return result;
    }
//    static public int numJewelsInStones(String j, String s) {
//        int result = 0;
//        if (j.length() == 0) return 0;
//        for (char jew : j.toCharArray()
//        ) {
//            for (int i = 0; i < s.length(); i++) {
//                char current = s.charAt(i);
//                if (current == jew) {
//                    result++;
//                }
//            }
//
//
//        }
//        return result;
//    }
}
