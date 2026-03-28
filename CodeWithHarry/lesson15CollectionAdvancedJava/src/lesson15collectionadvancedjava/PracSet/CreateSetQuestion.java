/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava.PracSet;

import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class CreateSetQuestion {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(34);
        
        hs.add(345);
        
        hs.add(23);
        
        hs.add(345);
        System.out.println(hs);
        
    }
}
