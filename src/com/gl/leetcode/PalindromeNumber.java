package com.gl.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    static public boolean isPalindrome(int x) {
        String origin = "" + x;
        int position = origin.length()-1;
        for (int i = 0; i <=( origin.length()/ 2); i++)
            if (origin.charAt(i) != origin.charAt(position - i)) {
                return false;
            }
        return true;
    }
}
