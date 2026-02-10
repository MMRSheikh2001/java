/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb10;

import feb10.Vehicle.Account;
import feb10.Vehicle.SavingsAccount;

/**
 *
 * @author Admin
 */
public class Bank {

    public static void main(String[] args) {
        Account a= new Account(5000);
        System.out.println("The account balance is " + a.displayAccountInfo());
        SavingsAccount sa = new SavingsAccount(10, 2);
        System.out.println("New balance after interest is "+ sa.addInterest());
        
    }

}
