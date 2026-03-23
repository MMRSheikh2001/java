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
public class PracSetFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Number");
        int n = sc.nextInt();
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }
        System.out.println("The Factorial of " + n + " is " + multi);
        System.out.println("While Loop Now");
        multi = 1;
        int i = 1;
        while (i <= n) {
            multi *= i;
            i++;
        }

        System.out.println("The Factorial of " + n + "using While Loop is " + multi);
    }
}
