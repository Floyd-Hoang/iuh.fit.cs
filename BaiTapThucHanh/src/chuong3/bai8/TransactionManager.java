/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 10:09:30 PM
 */

package chuong3.bai8;

/**
 * 
 */
import java.util.*;

public class TransactionManager {
    private List<Transaction> list = new ArrayList<>();

    public void add(Transaction t) {
        list.add(t);
    }

    public void displayAll() {
        System.out.printf("%-10s %-12s %12s %8s %-3s %-8s %-20s %15s%n",
            "Mã GD", "Ngày", "Đơn giá", "Diện tích",
            "Loại", "Kiểu", "Địa chỉ/Loại đất", "Thành tiền");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (Transaction t : list) {
            System.out.println(t);
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public Map<String, Long> countByType() {
        Map<String, Long> map = new HashMap<>();
        for (Transaction t : list) {
            map.merge(t.getType(), 1L, Long::sum);
        }
        return map;
    }

    public double averageLandAmount() {
        double sum = 0;
        int cnt = 0;
        for (Transaction t : list) {
            if (t instanceof LandTransaction) {
                sum += t.getTotalAmount();
                cnt++;
            }
        }
        return cnt > 0 ? sum / cnt : 0;
    }

    public List<Transaction> transactionsInMonth(int month, int year) {
        List<Transaction> res = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for (Transaction t : list) {
            cal.setTime(t.getTransactionDate());
            int m = cal.get(Calendar.MONTH) + 1;
            int y = cal.get(Calendar.YEAR);
            if (m == month && y == year) {
                res.add(t);
            }
        }
        return res;
    }
}
