/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb18;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SumPositive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give only Positive Integers");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n = sc.nextInt();
        }
        System.out.println("The sum of positive integers are : " + sum);
    }
}
