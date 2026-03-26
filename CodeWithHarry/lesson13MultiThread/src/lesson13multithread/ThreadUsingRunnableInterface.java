/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13multithread;

/**
 *
 * @author Administrator
 */
public class ThreadUsingRunnableInterface {

    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        Thread gun1 = new Thread(t1);
        Thread gun2 = new Thread(t2);

        gun1.start();
        gun2.start();
        
        System.out.println("Id of Thread 1 is "+ gun1.getId());
    }
}

class myThread1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {

            System.out.println("My thread1 is running");
            System.out.println("It is nice");
            i++;

        }

    }
}

class myThread2 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {

            System.out.println("My thread2 is running");
            System.out.println("It is Bad");
            i++;

        }

    }

}
