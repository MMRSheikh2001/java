/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson13multithread;

/**
 *
 * @author Administrator
 */
public class Lesson13MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        myThread12 t1 = new myThread12();
        myThread22 t2 = new myThread22();

        t1.start();
        t2.start();
        System.out.println(t1.getId());

    }

}

class myThread12 extends Thread {

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

class myThread22 extends Thread {

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
