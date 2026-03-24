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
public class PracSetWhtherArrayIsSorted {

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

        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted == false) {
            System.out.println("Array is not Sorted");
        } else {
            System.out.println("Array is sorted");
        }
    }
}
