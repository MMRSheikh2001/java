/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb10;

import feb10.Vehicle.Account;
import feb10.Vehicle.CurrentAccount;
import feb10.Vehicle.SavingsAccount;

/**
 *
 * @author Admin
 */
public class Bank {

    public static void main(String[] args) {
        Account a= new Account(5000);
        a.deposit();
        System.out.println("The account balance is " + a.displayAccountInfo());
        
        
        SavingsAccount sa = new SavingsAccount(10, 2, a.displayAccountInfo());
       
        
        sa.addInterest();
        
      //  System.out.println("The new account balance is " + a.displayAccountInfo());
        
      //  System.out.println("New balance after interest is "+ a.displayAccountInfo());
      
        CurrentAccount ca = new CurrentAccount(4000);
        ca.withdraw();
        
    }

}
