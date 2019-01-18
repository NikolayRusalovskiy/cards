package com.gl.leetcode;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

//    static public int maxProfit(int[] prices) {
//        int profit = 0;
//        int daybuy = 0;
//        int daysel = 0;
//        if (prices.length < 2) return 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int delta = prices[j] - prices[i];
//                if (profit < delta) {
//                    profit = delta;
//                }
//
//            }
//        }
//        return profit;
//    }

    static public int maxProfit(int[] prices) {
        if (prices.length == 0) {return 0;}
        int prevmax = prices[prices.length - 1];
        int maxdif = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > prevmax) {
                prevmax = prices[i];
            }
            if (maxdif < prevmax - prices[i]) {
                maxdif = prevmax - prices[i];
            }
        }
        return maxdif;
    }

}
