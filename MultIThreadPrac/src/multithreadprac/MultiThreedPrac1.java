/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadprac;

import multithreadprac.cls.PrintChar1;

/**
 *
 * @author Administrator
 */
public class MultiThreedPrac1 {

    public static void main(String[] args) {

        Runnable printA = new PrintChar1('A', 20);
        Runnable printB = new PrintChar1('B', 20);
        Runnable printC = new PrintChar1('C', 20);

        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(printC);

        t1.start();
        t2.start();
        t3.start();
    }

}
