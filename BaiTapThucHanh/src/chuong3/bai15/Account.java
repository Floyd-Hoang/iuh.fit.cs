/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 12-Oct-2025 0:12:16 AM
 */

package chuong3.bai15;

/**
 * 
 */
public class Account {
    private String acctId;
    private double balance;

    public Account(String acctId, double balance) {
        this.acctId = acctId;
        this.balance = balance;
    }

    public String getAcctId() {
        return acctId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

