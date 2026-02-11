/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb10.Vehicle;

/**
 *
 * @author Admin
 */
public class Account {

    public String accountNumber, accountHolderName;
    public double balance;
    public int deposit;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Account(int deposit) {
        this.deposit = deposit;
    }

    public void deposit() {
        System.out.println("The deposit is " + deposit);
        balance += deposit;
    }

   // public void setBalance(double balance) {
   //     this.balance = balance;
   // }
    
    

    public double displayAccountInfo() {
        return balance;
    }
    
    public double displayAccountInfoAfterInterest(){
   
    return balance;
    }

}
