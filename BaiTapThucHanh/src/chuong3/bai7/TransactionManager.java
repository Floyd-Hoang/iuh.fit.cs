/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 12:02:10 PM
 */

package chuong3.bai7;

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
        System.out.printf("%-10s %-12s %-15s %-15s %-10s %-8s %-15s%n",
            "Mã GD", "Ngày", "Đơn giá", "Số lượng",
            "Loại", "Tiền tệ", "Thành tiền");
        System.out.println("----------------------------------------------------------------------------------");
        for (Transaction t : list) {
            System.out.println(t);
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    public Map<String, Long> countByType() {
        Map<String, Long> map = new HashMap<>();
        for (Transaction t : list) {
            map.merge(t.getType(), 1L, Long::sum);
        }
        return map;
    }

    public double averageCurrencyAmount() {
        double sum = 0;
        int count = 0;
        for (Transaction t : list) {
            if (t instanceof CurrencyTransaction) {
                sum += t.getTotalAmount();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public List<Transaction> transactionsOver(double threshold) {
        List<Transaction> res = new ArrayList<>();
        for (Transaction t : list) {
            if (t.getTotalAmount() > threshold) {
                res.add(t);
            }
        }
        return res;
    }
}
