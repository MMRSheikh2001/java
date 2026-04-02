/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poshomepractice;

/**
 *
 * @author Administrator
 */
public class BinarySearch {

    public static void main(String[] args) {

        //O(logn) base of log is 2
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int number = 11;
        int index = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {

                index = mid;
                break;
            } else if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println("Element found at index : " + index);

    }
}
