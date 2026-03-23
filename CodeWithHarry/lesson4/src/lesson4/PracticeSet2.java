/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PracticeSet2 {

    public static void main(String[] args) {
        //3
        Scanner sc = new Scanner(System.in);
        double tax = 0;
        System.out.println("Give Income in Lakhs ");
        double inc = sc.nextFloat();
        sc.close();
        if (inc < 2.5) {
            tax = 0;
        }
        if (inc >= 2.5 && inc < 5) {
            tax = (inc - 2.5) * 0.05;
        }
        if (inc >= 5 && inc <= 10) {
            tax = 2.5 * 0.05 + (inc - 5) * 0.2;
        }
        if (inc > 10) {
            tax = 2.5 * 0.05 + 5 * 0.2 + (inc - 10) * 0.3;
        }
        System.out.println("Tax is : " + tax * 100000);

    }
}
