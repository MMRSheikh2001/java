/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan29;

import java.util.Scanner;

/**
 *
 * @author Mahbub
 */
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Give Letter");
        char input = s.next().toLowerCase().charAt(0);
        
        
        if(input == 'a' || input =='e' || input =='i' || input =='o' || input =='u'){
            System.out.println("It is Vowel");
        } else{
            System.out.println("It is consonent");
        }
    }
    
}
