/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 12-Oct-2025 0:13:34 AM
 */

package chuong3.bai15;

/**
 * 
 */
public class TermDepositAccount extends Savings {
    private int term;

    public TermDepositAccount(String acctId, double balance, double intRate, int term) {
        super(acctId, balance, intRate);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
