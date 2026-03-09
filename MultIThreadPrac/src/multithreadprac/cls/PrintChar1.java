/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadprac.cls;

/**
 *
 * @author Administrator
 */
public class PrintChar1 implements Runnable {

    private char charToPrint;
    private int times;

    public PrintChar1() {
    }

    public PrintChar1(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint + " ");
        }
    }

}
