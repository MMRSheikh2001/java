/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson15collectionadvancedjava.PracSet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class DateQuestion {

    public static void main(String[] args) {
        //QS No 2
        Date d = new Date();
        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
        
        
        //QS No 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
  
    
        //QS No 4
         LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("H-m-s");
        String myDate = ldt.format(dtf);
        
        System.out.println(myDate);
    
    
    
    }
}
