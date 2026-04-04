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
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {23, 65, 76, 12, 32, 23, 45, 54, 34, 78, 9, 78, 90, 67, 45, 65, 56, 98};
        int minIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }
}
