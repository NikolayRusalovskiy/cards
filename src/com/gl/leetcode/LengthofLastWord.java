package com.gl.leetcode;

public class LengthofLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(null));
    }

    static public int lengthOfLastWord(String s) {
      return s.trim().length()-s.trim().lastIndexOf(" ")-1;

    }
}
