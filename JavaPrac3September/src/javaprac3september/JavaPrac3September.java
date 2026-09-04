/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprac3september;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaPrac3September {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");
        int n = sc.nextInt();
//        System.out.println("Given number is Even which is " + (n % 2 == 0));
//        Integer a = 127;
//        Integer b = 127;
//        System.out.println(a == b);
//
//        String c = new String("Mahbub");
//        String d = new String("Mahbub");
//
//        System.out.println(c.equals(d));

        System.out.println(isPrime(n));

        System.out.println(isPalindrome(n));

        System.out.println(reverseNumber(n));

        System.out.println(findFactorial(n));

        generateFibonacci(n);
        System.out.println(generateFibonacci(n));

    }

    public static Boolean isPrime(Integer number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isPalindrome(Integer number) {

        String num = number.toString();
        String newa = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            newa = newa + num.charAt(i);

        }

        return num.equals(newa);

    }

    public static Integer reverseNumber(Integer number) {
        String num = number.toString();
        String reversed = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            reversed = reversed + num.charAt(i);

        }

        return Integer.valueOf(reversed);

    }

    public static Integer findFactorial(Integer number) {
        int multi = 1;

        for (int i = 1; i <= number; i++) {
            multi *= i;

        }
        return multi;

    }

    public static List<Integer> generateFibonacci(Integer n) {

        List<Integer> nums = new ArrayList<>();
        if (n == 1) {

            nums.add(0);
        } else if (n == 2) {

            nums.add(0);
            nums.add(1);
        } else if (n > 2) {
            int a = 0;
            int b = 1;

            nums.add(0);
            nums.add(1);

            for (int i = 2; i <= n; i++) {

                int c = a + b;

                nums.add(c);
                a = b;
                b = c;

            }

        }

        return nums;
    }

}
