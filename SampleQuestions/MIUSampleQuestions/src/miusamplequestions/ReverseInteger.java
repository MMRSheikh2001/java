/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miusamplequestions;

/**
 * Write a function to reverse an integer using numeric operators and without
 * using any arrays or other data structures. The signature of the function is:
 * int f(int n)
 */
public class ReverseInteger {
    
    public static void main(String[] args) {
        System.out.println(reverseInteger(1243));
    }
    
    public static int reverseInteger(int n) {
        int result = 0;
        String reverse = "";
        while (n != 0) {
            int a = n % 10;
            n = (int) n / 10;
            reverse = reverse + a;
        }
        result = Integer.parseInt(reverse);
        return result;
        
    }
}
