package com.gl.leetcode;

public class RomanToInteger {

    public static void main(String[] args) {
        String a= "IV";
        String b = "II";
        String c  = "MMM";
        System.out.println(romanToInt(a));
        System.out.println(romanToInt(b));
        System.out.println(romanToInt(c));
    }
    public static int romanToInt(String s) {
        int cursorPos = 0;
        int number = 0;
        while (cursorPos < s.length()) {
            int numberCur = parseRomanNumeral(s.charAt(cursorPos));
            int numberNext = (cursorPos + 1 < s.length()) ?
                    parseRomanNumeral(s.charAt(cursorPos + 1)) :
                    0;
            if (numberCur >= numberNext) {
                number += numberCur;
                cursorPos += 1;
            } else {
                number += (numberNext - numberCur);
                cursorPos += 2;
            }
        }
        return number;
    }

    private static int parseRomanNumeral(char romanNumeral) {
        switch (romanNumeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
