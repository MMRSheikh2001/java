/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3strings;

/**
 *
 * @author Administrator
 */
public class StringMethods1 {
    
    public static void main(String[] args) {
        String name = "Mahbub";
        
        int length = name.length();
        System.out.println(length);
        
        String lower = name.toLowerCase();
        System.out.println(lower);
        
        String upper = name.toUpperCase();
        System.out.println(upper);
        
        String name1 = "   My name is Mahbub  ";
        String trimmed = name1.trim();
        System.out.println(trimmed);
        
        String substr = trimmed.substring(4);
        System.out.println(substr);
        
        String substr1 = trimmed.substring(5, 9);
        System.out.println(substr1);
        
        String replaced = trimmed.replace('i', 'w');
        
        System.out.println(replaced);
        
        int chatat = trimmed.indexOf(substr);
        System.out.println(chatat);
        
        char chara = trimmed.charAt(3);
        System.out.println(chara);
        
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(upper));
        
    }
}
