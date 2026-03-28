/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava;

import java.util.ArrayDeque;

/**
 *
 * @author Administrator
 */
public class ArrayDequePrac {

    public static void main(String[] args) {
        
        //More advanced than Linked list with additional methods like removeFirst,removeLast method added
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(12);
        d.add(23);
        d.add(34);
        d.add(45);
        d.add(56);
        d.add(67);
        d.add(78);
        d.add(89);
        System.out.println(d);

    }
}
