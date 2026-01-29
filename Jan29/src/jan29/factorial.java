/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan29;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class factorial {
    public static void main(String[] args) {
        int multi = 1;
        int count = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Give Number");
        int given = s.nextInt();
        while(count <= given){
            multi = count * multi;
            count++;
        }
        System.out.println("The factorial of "+ given +" is " + multi);
    }
    
}
