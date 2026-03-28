/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava;

/**
 *
 * @author Administrator
 */
public class DateAndTime {

    public static void main(String[] args) {
        //Times Since 1970 in miliSeconds
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 365 / 24);
        System.out.println(System.currentTimeMillis()<Long.MAX_VALUE);

    }
}
