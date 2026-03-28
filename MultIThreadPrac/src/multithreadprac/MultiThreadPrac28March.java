/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadprac;

/**
 *
 * @author Admin
 */
public class MultiThreadPrac28March {

    public static void main(String[] args) {

        Thread MThread = new MyThread();
        Thread MTh1 = new MyThread1();

        MThread.start();
        MTh1.start();

    }
}

class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.print("A");
        }

    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.print("B");
        }

    }

}
