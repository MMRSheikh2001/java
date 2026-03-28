/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class LinkedListPrac {
    
    public static void main(String[] args) {
        
        //Linked list has all methods of arraylist plun new ones like addLast,addFirst
        LinkedList<Integer> l = new LinkedList<>();
        List<String> s = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            
            l.add(i);
        }
        
        l.addLast(190);
        l.addFirst(25);
        System.out.println(l);
        
    }
}
