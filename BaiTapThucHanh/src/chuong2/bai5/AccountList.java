/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 1:14:45 PM
 */

package chuong2.bai5;

/**
 * 
 */
public class AccountList {
    private Account[] accList;
    private int count;

    public AccountList() {
        accList = new Account[10];
        count = 0;
    }

    public AccountList(int n) {
        if (n > 0) {
            accList = new Account[n];
        } else {
            accList = new Account[10];
        }
        count = 0;
    }

    public boolean them(Account acc) {
        for (int i = 0; i < count; i++) {
            if (accList[i].getSotk() == acc.getSotk()) {
                return false;
            }
        }
        if (count < accList.length) {
            accList[count] = acc;
            count++;
            return true;
        }
        return false;
    }

    public Account timKiemTheoSoTK(long stk) {
        for (int i = 0; i < count; i++) {
            if (accList[i].getSotk() == stk) {
                return accList[i];
            }
        }
        return null;
    }

    public boolean xoaTheoSoTK(long stk) {
        for (int i = 0; i < count; i++) {
            if (accList[i].getSotk() == stk) {
                for (int j = i; j < count - 1; j++) {
                    accList[j] = accList[j + 1];
                }
                accList[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public int soLuongTK() {
        return count;
    }

    public void inDanhSach() {
        for (int i = 0; i < count; i++) {
            System.out.println(accList[i].toString());
        }
    }
}
