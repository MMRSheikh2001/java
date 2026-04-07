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
public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = {23, 65, 76, 12, 32, 23, 45, 54, 34, 78, 9, 78, 90, 67, 45, 65, 56, 98};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                
            }
            arr[j + 1] = key;
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
