/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringtest;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SplitTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] split = s.split("[ !,?._'@]+");

        System.out.println(split.length);
        for (String word : split) {
            System.out.println(word);
        }
    }
}
