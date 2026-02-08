/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb8;

import feb8.pos.BalanceCheck;

/**
 *
 * @author Admin
 */
public class BankBalance {

    public static void main(String[] args) {
        BalanceCheck bc = new BalanceCheck();
        bc.setDeposit(5000);
        bc.deposit();
        System.out.println("The balance is " + bc.getBalance());

        bc.setWithdraw(500);
        bc.withdraw();
        System.out.println("You withdrew " + bc.getWithdraw());
        System.out.println("The new Balance is " + bc.getBalance());
    }
}
