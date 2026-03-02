/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaryio;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bubbleSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give array length");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Give the " + (i + 1) + "th Number");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(numbers));
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] >= numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(numbers));
        
    }
}
