/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Administrator
 */
public class DateTimeFormatterPrac {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String myDate = ldt.format(dtf);
        
        System.out.println(myDate);
        
        
        
    }
}
