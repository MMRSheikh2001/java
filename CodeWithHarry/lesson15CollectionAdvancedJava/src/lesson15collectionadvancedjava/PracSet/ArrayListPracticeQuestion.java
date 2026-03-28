/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava.PracSet;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ArrayListPracticeQuestion {
    public static void main(String[] args) {
        
        ArrayList<String> ar=new ArrayList<>();
        ar.add("Mahbub");
        ar.add("Sabbir");
        ar.add("Tanvir");
        ar.add("Badrul");
        ar.add("Emon");
        ar.add("Mishkat");
        ar.add("Sadia");
        ar.add("Shimul");
        ar.add("Rehana");
        ar.add("Sajin");
        System.out.println(ar);
        for(Object item: ar){
            System.out.println(item);
        
        }
        
        
        
        
    }
}
