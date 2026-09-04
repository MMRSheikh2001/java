/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stockbuysell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Find the maximum profit from a single stock buy and sell.
 *
 * Instructions The first line of input contains an integer N.
 *
 * The next N lines each contain one integer representing the stock price on
 * that day.
 *
 * You may buy on one day and sell on a later day.
 *
 * Print the maximum profit possible.
 *
 * If no profit is possible, print 0.
 *
 * Input used in test: 6 7 1 5 3 6 4 Important: To solve the problem your code
 * has to return a correct result for other values as well. Expected Output 5
 * Reason: Buy on day 2 (price=1), sell on day 5 (price=6). Profit = 6 - 1 = 5.
 */
public class StockBuySell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // Find and print the maximum profit
        List<Integer> profits = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                int profitGained = prices[j] - prices[i];
                profits.add(profitGained);
            }
        }
        int profit = 0;
        for (int i = 0; i < profits.size(); i++) {
            if (profits.get(i) > profit) {
                profit = profits.get(i);

            }

        }
        System.out.println(profit);

    }

}
