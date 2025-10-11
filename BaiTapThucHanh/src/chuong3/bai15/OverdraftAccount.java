/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 12-Oct-2025 0:12:48 AM
 */

package chuong3.bai15;

/**
 * 
 */
public class OverdraftAccount extends Account {
    private double odLimit;
    private double overdraft;
    private double availableBalance;

    public OverdraftAccount(String acctId, double balance, double odLimit) {
        super(acctId, balance);
        this.odLimit = odLimit;
        this.overdraft = 0;
        this.availableBalance = balance + odLimit;
    }

    public double getOdLimit() {
        return odLimit;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setOdLimit(double odLimit) {
        this.odLimit = odLimit;
        this.availableBalance = getBalance() + odLimit;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= getAvailableBalance()) {
            double bal = getBalance() - amount;
            if (bal < 0) {
                overdraft = -bal;
                super.withdraw(getBalance());
            } else {
                super.withdraw(amount);
            }
            availableBalance = getBalance() + odLimit;
            return true;
        }
        return false;
    }
}

