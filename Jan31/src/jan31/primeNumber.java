/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan31;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class primeNumber {

    public static void main(String[] args) {
        System.out.println("Give the Number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println("It is Prime Number");

        } else {
            System.out.println("It is Not Prime Number");
        }
    }

}
