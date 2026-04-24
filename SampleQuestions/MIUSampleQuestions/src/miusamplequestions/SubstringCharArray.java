/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miusamplequestions;

import java.util.Arrays;

/**
 * Write a function that accepts a character array, a zero-based start position
 * and a length. It should return a character array containing containing
 * lengthcharacters starting with the startcharacter of the input array. The
 * function should do error checking on the start position and the length and
 * return null if the either value is not legal. The function signature is:
 * char[ ] f(char[ ] a, int start, int len)
 */
public class SubstringCharArray {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
        char[] cArr = substringCharArray(arr, 0, 5);
        System.out.println(Arrays.toString(cArr));
    }

    public static char[] substringCharArray(char[] arr, int start, int len) {
        if (len < 0 || start < 0 || start + len > arr.length) {
            return null;

        }
        char[] charArr = new char[len];
        for (int i = 0; i < len; i++) {

            charArr[i] = arr[start + i];
        }

        return charArr;
    }
}
