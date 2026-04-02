/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingarray;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class BubbleSorting {
    
    public static void main(String[] args) {
        int[] arr = {12, 45, 32, 56, 43, 78, 98, 76, 54, 32, 23, 32, 87, 78, 90};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
                
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
