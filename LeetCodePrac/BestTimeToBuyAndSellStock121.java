
public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {

    }
}

// class Solution {
// public int maxProfit(int[] prices) {

// int min = prices[0];
// int profit = 0;
// for (int i = 1; i < prices.length - 1; i++) {
// if (prices[i] - min > profit) {
// profit = prices[i] - min;
// }
// if (prices[i] < min) {
// min = prices[i];
// }
// }

// return profit;

// }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length - 1; i++) {

            if (prices[i] < min) {
                min = prices[i];
            } else {
                continue;
            }

            for (int j = i; j < prices.length; j++) {

                if (prices[j] - min > profit) {
                    profit = prices[j] - min;
                }
            }
        }

        return profit;
    }
}

// class Solution {
// public int maxProfit(int[] prices) {
// int max = 0;
// for (int i = 0; i < prices.length - 1; i++) {
// for (int j = i; j < prices.length; j++) {

// if (prices[j] - prices[i] > max) {
// max = prices[j] - prices[i];
// }
// }
// }

// return max;
// }
// }