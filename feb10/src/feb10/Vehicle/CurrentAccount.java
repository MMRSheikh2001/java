/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb10.Vehicle;

/**
 *
 * @author Admin
 */
public class CurrentAccount extends  Account{
    public int withdraw;

    public CurrentAccount() {
    }

    public CurrentAccount(int withdraw) {
        this.withdraw = withdraw;
    }
    
    public void withdraw(){
    if(super.balance >= withdraw){
        super.balance -= withdraw;
        System.out.println("You withdrew " + withdraw);
        System.out.println("Your new Account Balance is " + super.balance);
    } else{
        System.out.println("Insufficient Balance");
    }
    }
    
}
