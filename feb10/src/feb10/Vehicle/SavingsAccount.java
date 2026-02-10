/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb10.Vehicle;

/**
 *
 * @author Admin
 */
public class SavingsAccount extends Account{
   public double interestRate;
   public int year;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate, int year) {
        this.interestRate = interestRate;
        this.year = year;
    }
    
    

    public SavingsAccount(double interestRate, int year, double balance) {
        super(balance);
        this.interestRate = interestRate;
        this.year = year;
    }
   
   public double addInterest(){
     super.balance=  super.balance+ super.balance * year* interestRate/100;
   return super.balance;
   }
}
