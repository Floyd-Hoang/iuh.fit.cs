/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:15:49 PM
 */

package chuong3.bai9;

/**
 * 
 */
import java.util.*;
import java.text.SimpleDateFormat;

public class InvoiceManager {
    private List<Customer> list = new ArrayList<>();

    public void add(Customer c) {
        list.add(c);
    }

    public void displayAll() {
        System.out.printf("%-8s %-15s %-10s %-10s %-10s %-8s %-12s%n",
            "MãKH", "Họ Tên", "Ngày HĐ", "Đơn giá", "Số lượng",
            "Loại", "Thành tiền");
        System.out.println("-----------------------------------------------------------------------");
        for (Customer c : list) {
            System.out.println(c);
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    public Map<String, Long> countByType() {
        Map<String, Long> m = new HashMap<>();
        for (Customer c : list) {
            m.merge(c.getType(), 1L, Long::sum);
        }
        return m;
    }

    public double avgForeignAmount() {
        double sum = 0;
        int cnt = 0;
        for (Customer c : list) {
            if (c instanceof ForeignCustomer) {
                sum += c.calcAmount();
                cnt++;
            }
        }
        return cnt > 0 ? sum / cnt : 0;
    }

    public List<Customer> invoicesInMonth(int month, int year) {
        List<Customer> res = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for (Customer c : list) {
            cal.setTime(c.getInvoiceDate());
            int m = cal.get(Calendar.MONTH) + 1;
            int y = cal.get(Calendar.YEAR);
            if (m == month && y == year) {
                res.add(c);
            }
        }
        return res;
    }
}
