/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean match = false;
        int count = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char target = a.charAt(i);
                int index = b.indexOf(target);
                if (index != -1) {

                    count++;
                    b = b.substring(0, index) + b.substring(index + 1);
                }

            }
        }

        if (count == a.length()) {
            match = true;

        }

        return match;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
