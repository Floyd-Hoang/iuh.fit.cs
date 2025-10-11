/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 12-Oct-2025 0:13:59 AM
 */

package chuong3.bai15;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class BankingServices {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void test() {
        Account a1 = new Account("A100", 5000);
        OverdraftAccount o1 = new OverdraftAccount("O200", 3000, 2000);
        Savings s1 = new Savings("S300", 8000, 0.05);
        TermDepositAccount t1 = new TermDepositAccount("T400", 10000, 0.07, 12);

        addAccount(a1);
        addAccount(o1);
        addAccount(s1);
        addAccount(t1);

        for (Account a : accounts) {
            System.out.println(a.getAcctId() + " balance: " + a.getBalance());
            a.deposit(1000);
            System.out.println(" after deposit: " + a.getBalance());
            a.withdraw(2000);
            System.out.println(" after withdrawal: " + a.getBalance());
            if (a instanceof Savings) {
                ((Savings) a).addInterestToBalance();
                System.out.println(" after interest: " + a.getBalance());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new BankingServices().test();
    }
}

