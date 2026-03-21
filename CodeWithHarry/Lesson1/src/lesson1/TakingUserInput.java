/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TakingUserInput {

    public static void main(String[] args) {
        System.out.println("Enter Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int i;
        int n = 0;
        boolean a = sc.hasNext();
        while (a) {
            i = sc.nextInt();
            if (i == 0) {

                a = false;
            }
            n += i;

        }
        System.out.println("total : " + n);
    }
}
