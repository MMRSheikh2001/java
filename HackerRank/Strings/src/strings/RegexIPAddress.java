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
public class RegexIPAddress {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

class MyRegex {

    String zeroTo255 = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";

    // Combine the four segments with dots
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

}
