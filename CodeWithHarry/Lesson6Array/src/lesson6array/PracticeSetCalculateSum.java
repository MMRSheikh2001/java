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
public class PracticeSetCalculateSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Array Length");
        int n = sc.nextInt();
        float[] numbers = new float[n];
        float sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Give The " + (i + 1) + "th number");
            numbers[i] = sc.nextFloat();
            sum += numbers[i];
        }
        System.out.println("The Array is : " + Arrays.toString(numbers));
        System.out.println("The Sum of all elements in Array is : " + sum);

        System.out.println("Give Number You want to search");
        float num = sc.nextFloat();
        boolean found = true;
        for (float f : numbers) {
            if (f == num) {
                System.out.println("Number Found");
                found = true;
                break;

            } else {
                found = false;
            }
        }

        if (found == false) {
            System.out.println("Numbers Not Found");
        }

    }
}
