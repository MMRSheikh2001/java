/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcodeproblems;

/**
 *
 * @author Administrator
 */
public class Swrt69 {
    public static void main(String[] args) {
         Solution solution = new Solution();
         int a =solution.addDigits(38);
        System.out.println(a);
    }
    
}
class Solution {
    public int addDigits(int num) {
        String number = "" + num;
        while (number.length() != 1) {
            num = 0;
            for (int i = 0; i < number.length(); i++) {

                num += Integer.valueOf(number.charAt(i));
            }
            number = "" + num;

        }

        return num;
    }
}