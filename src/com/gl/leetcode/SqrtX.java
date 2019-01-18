package com.gl.leetcode;

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(-1));
    }

    static public int mySqrt(int x) {
        if (x < 0) return 0;
        int res = (int) (Math.sqrt(x) * 10) / 10;
        return res;
    }
}
