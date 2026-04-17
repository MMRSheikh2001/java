/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SubStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] sList = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {

            sList[i] = s.substring(i, i + k);
        }
        smallest = sList[0];
        largest = sList[0];

        for (int i = 1; i < sList.length; i++) {
            if (sList[i].compareTo(smallest) < 0) {
                smallest = sList[i];
            }
            if (sList[i].compareTo(largest) > 0) {
                largest = sList[i];
            }

        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
