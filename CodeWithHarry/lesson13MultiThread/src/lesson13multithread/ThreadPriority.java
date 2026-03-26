/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ThreadPriority {

    public static void main(String[] args) {
        myThread11 t1 = new myThread11();
        myThread21 t2 = new myThread21();
        myThread31 t3 = new myThread31();
        myThread41 t4 = new myThread41();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPriority.class.getName()).log(Level.SEVERE, null, ex);
        }
        t3.start();
        t4.start();

    }
}

class myThread11 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 300) {

            System.out.println("My cooking Thread1 is running");
            System.out.println("I am happy");
            i++;

        }

    }

}

class myThread21 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 300) {

            System.out.println("My Thread2 is running");
            System.out.println("I am sad");

            i++;

        }

    }

}

class myThread31 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 300) {

            System.out.println("My cooking Thread3 is running");
            System.out.println("I am happy");
            i++;

        }

    }

}

class myThread41 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 300) {

            System.out.println("My Thread4 is running");
            System.out.println("I am sad");

            i++;

        }

    }

}
