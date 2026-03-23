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
public class PracSetMultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Number");
        int sum = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multi = n * i;
            sum += multi;
            System.out.println(i + " x " + n + " =  " + multi);

        }
        System.out.println("Reversed Order");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " x " + n + " =  " + n * i);
        }
        System.out.println("The Sum of All Numbers in multiplication table is " + sum);
    }
}
