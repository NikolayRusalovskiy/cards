package com.gl.leetcode;

public class CountPrimes {
    /*
    Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    private static int countPrimes(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (i % j != 0) {
                    result++;
                }
            }

        }
        return result;
    }

}
