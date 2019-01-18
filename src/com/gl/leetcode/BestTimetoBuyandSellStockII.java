package com.gl.leetcode;

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 8, 9, 10};
        System.out.println(maxProfit(prices));
    }

    static public int maxProfit(int[] prices) {

        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;


//        int profit = 0;
//        if (prices.length < 2) return 0;
//        for (int i =0; i<prices.length-1;i++){
//            int buy=prices[i];
//            for (int j = i+1; j <prices.length ; j++) {
//                int sell=prices[j];
//                if (sell-buy>profit) profit=sell-buy;
//
//            }
//
//        }
//
//        return profit;
        /*"        Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.\n"
         */
    }
}
