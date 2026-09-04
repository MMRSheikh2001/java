/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Administrator
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(Solution.reverse(125));
    }
}

class Solution {

    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        
        System.out.println(Integer.MAX_VALUE);

        int newNumber = 0;

        while (x != 0) {
            int remaineder = x % 10;

            newNumber = newNumber * 10 + remaineder;

            x = x - remaineder;
            x = x / 10;

        }
        return newNumber;
    }
}
