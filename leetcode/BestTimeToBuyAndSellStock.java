package leetcode;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[i] < prices[j]) {
                int diff = prices[j] - prices[i];
                if (diff > max) max = diff;
            } else {
                i = j;
            }
        }
        return max;
    }
}
