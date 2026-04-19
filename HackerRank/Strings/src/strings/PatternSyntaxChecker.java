/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                //trying to compile pattern to check it's validity
                Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (Exception e) {
                System.out.println("Invalid");
            }

            testCases--;
        }
    }
}
