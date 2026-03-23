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
public class PracSet1AddnEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum is : " + sum);
        sc.close();
        System.out.println("Using While Loop");
        int sum2 = 0;
        int i = 0;
        while (i <= n) {
            sum2 += i;
            i += 2;
        }

        System.out.println("Sum is : " + sum2);
    }
}
