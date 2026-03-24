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
public class PracSetMinMax {

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
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
            }
            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }
        System.out.println("The Maximum Number is " + max);
        System.out.println("The minimum Number is " + min);
    }
}
