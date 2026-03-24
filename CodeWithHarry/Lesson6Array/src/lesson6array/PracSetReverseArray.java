/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PracSetReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Array Length");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Give The " + (i + 1) + "th number");
            numbers[i] = sc.nextInt();
        }
        System.out.println("The Array is : " + Arrays.toString(numbers));
        for (int i = 0; i < n / 2; i++) {

            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;

        }

        System.out.println("The reversed Array is " + Arrays.toString(numbers));
    }
}
