/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miusamplequestions;

/**
 *
 * @author Administrator
 */
public class CenterArray {

    ////An array with an odd number of elements is said to be centered if all elements (except
    //the middle one) are strictly greater than the value of the middle element. Note that only
    //arrays with an odd number of elements have a middle element. Write a function that
    //accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 4, 3, 6, 10};
        System.out.println(centerOfArray(arr));
    }

    public static int centerOfArray(int[] arr) {
        int value = 0;
        if (arr.length % 2 == 1) {
            int midIndex = arr.length / 2;
            int midIndexValue = arr[midIndex];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < midIndexValue) {
                    value = 0;
                    break;
                }
                if (arr[i] > midIndexValue) {
                    value = 1;
                }

            }

        }
        return value;
    }
}
