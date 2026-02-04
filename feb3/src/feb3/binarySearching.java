/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class binarySearching {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give the array length");
        int n = s.nextInt();
        int numbers[] = new int[n];
        System.out.println("Before loop " + Arrays.toString(numbers));
        for (int i = 0; i < n; i++) {
            System.out.println("Give the " + (i + 1) + "th number");
            numbers[i] = s.nextInt();
        }
        System.out.println("After the Loop " + Arrays.toString(numbers));
        System.out.println("Give the number whose index position you want in array");
        int userSearchingNumber = s.nextInt();
        linearSearch(numbers, userSearchingNumber);
        
        sort(numbers);
        
    }
    
    public static void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //ascending order sorting
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("The ascending order sorted array is " + Arrays.toString(array));
    }
    
    public static int binarySearch(int array[], int searchNumber) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int midIndex = (int) (firstIndex + lastIndex) / 2;
        int indexPosition = 0;
        for (int i = 0; i <= midIndex; i++) {
        }
        return 0;
    }
    
    public static void linearSearch(int array[], int searchNumber) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("The Number has been found in index position " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The Number is not found in Array");
        }
    }
    
}
