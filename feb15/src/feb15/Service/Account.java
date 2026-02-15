package feb15.Service;

import feb15.AccountUtil;

public abstract class Account implements AccountUtil {

    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void checkBalance() {

        System.out.println("Current Balance: " + balance);
    }

}
