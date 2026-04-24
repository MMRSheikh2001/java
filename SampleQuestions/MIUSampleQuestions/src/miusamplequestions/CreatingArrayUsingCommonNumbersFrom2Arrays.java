/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miusamplequestions;

import java.util.Arrays;

/**
 * Write a function to return an array containing all elements common to two
 * given arrays containing distinct positive integers. You should not use any
 * inbuilt methods. You are allowed to use any number of arrays. The signature
 * of the function is: int[] f(int[] first, int[] second)
 */
public class CreatingArrayUsingCommonNumbersFrom2Arrays {

    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {2, 3, 4};
        int[] result = createCommonArrayItems(first, second);
        System.out.println(Arrays.toString(result));
    }

    public static int[] createCommonArrayItems(int[] first, int[] second) {
        int count = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    count++;
                }

            }

        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    newArr[index] = first[i];
                    index++;
                    break;
                }

            }

        }

        return newArr;
    }
}
