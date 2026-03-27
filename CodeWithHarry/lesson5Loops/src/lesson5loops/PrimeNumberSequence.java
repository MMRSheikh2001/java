/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5loops;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PrimeNumberSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Prime Number do you want?");
        int how = sc.nextInt();
        sc.close();
        int counta = 0;
        int n = 1;
        while (counta < how) {

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {

                    count++;
                }

            }
            if (count == 2) {

                System.out.println(n);
                counta++;

            }
            n++;

        }
    }
}
