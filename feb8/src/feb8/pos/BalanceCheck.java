package feb8.pos;

/**
 *
 * @author Admin
 */
public class BalanceCheck {

    private int accNo, deposit;
    private double balance, withdraw;

    public BalanceCheck() {
    }

    public BalanceCheck(int accNo, int deposit) {
        this.accNo = accNo;
        this.deposit = deposit;
    }

    public BalanceCheck(int accNo, double withdraw) {
        this.accNo = accNo;
        this.withdraw = withdraw;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double deposit() {
        balance += deposit;
        return balance;
    }

    public double withdraw() {
        if (balance >= withdraw) {
            balance -= withdraw;
        } else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
}
