/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13multithread.PracSet;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Question1 {

    public static void main(String[] args) {

        Thred1 t1 = new Thred1();
        Thred2 t2 = new Thred2();
        
        t1.setPriority(5);
        t2.setPriority(9);
        
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

    }
}

class Thred1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {

            System.out.println("Good Morning");
        }

    }

}

class Thred2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 30000; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thred2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Welcome");
        }

    }

}
