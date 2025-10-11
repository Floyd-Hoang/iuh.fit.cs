/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 12-Oct-2025 0:13:11 AM
 */

package chuong3.bai15;

/**
 * 
 */
public class Savings extends Account {
    private double intRate;
    private double intAmount;

    public Savings(String acctId, double balance, double intRate) {
        super(acctId, balance);
        this.intRate = intRate;
        this.intAmount = 0;
    }

    public double getIntRate() {
        return intRate;
    }

    public double getIntAmount() {
        return intAmount;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double calculateInterest() {
        return getBalance() * intRate;
    }

    public void addInterestToBalance() {
        intAmount = calculateInterest();
        deposit(intAmount);
    }
}

