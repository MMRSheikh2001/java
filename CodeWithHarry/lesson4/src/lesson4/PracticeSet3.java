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
public class PracticeSet3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Year");
        int year = sc.nextInt();
        sc.close();

        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }

    }
}
