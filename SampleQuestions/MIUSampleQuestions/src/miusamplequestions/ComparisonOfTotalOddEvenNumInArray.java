/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miusamplequestions;

/**
 * Write a function that takes an array of integers as an argument and returns a
 * value based on the sums of the even and odd numbers in the array. Let X = the
 * sum of the odd numbers in the array and let Y = the sum of the even numbers.
 * The function should return X – Y
 */
public class ComparisonOfTotalOddEvenNumInArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 7};
        System.out.println(compareTotalOddEvenNumInArray(arr));
    }
    
    public static int compareTotalOddEvenNumInArray(int[] arr) {
        int value = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
                
            }
            if (arr[i] % 2 == 1) {
                oddSum += arr[i];
            }
        }
        value = oddSum - evenSum;
        
        return value;
    }
    
}
