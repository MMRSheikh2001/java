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
public class RelationalLogicalOperators {

    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//        if (a && b) {
//            System.out.println("You win");
//        } else {
//            System.out.println("You Lose");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Give Age");
        int age = sc.nextInt();
        sc.close();
        if (age > 60) {
            System.out.println("You should Retire");
        } else if (age > 50) {
            System.out.println("You are experienced");
        } else if (age > 40) {
            System.out.println("You are semi Experienced");
        } else if (age > 25) {
            System.out.println("You are some Noob");
        } else if (age > 18) {
            System.out.println("You are beginner");
        } else if (age > 0) {
            System.out.println("You are Underaged");
        } else {
            System.out.println("Invalid Age");
        }
    }
}
