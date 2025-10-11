/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 10:09:41 PM
 */

package chuong3.bai8;

/**
 * 
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        TransactionManager mgr = new TransactionManager();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        mgr.add(new LandTransaction("GD01", fmt.parse("15/09/2013"), 500000,  50, "A"));
        mgr.add(new LandTransaction("GD02", fmt.parse("20/09/2013"), 300000,  30, "B"));
        mgr.add(new HouseTransaction("GD03", fmt.parse("10/08/2013"), 4000000, 100, "cao cấp",  "123 Lê Lợi"));
        mgr.add(new HouseTransaction("GD04", fmt.parse("05/09/2013"), 2000000,  80, "thuong",   "456 Trần Phú"));

        mgr.displayAll();

        Map<String, Long> cnts = mgr.countByType();
        System.out.println("Số giao dịch Đất: " + cnts.getOrDefault("Đất", 0L));
        System.out.println("Số giao dịch Nhà: " + cnts.getOrDefault("Nhà", 0L));

        System.out.printf("Trung bình thành tiền GD Đất: %, .0f%n", mgr.averageLandAmount());

        System.out.println("Giao dịch tháng 9/2013:");
        for (Transaction t : mgr.transactionsInMonth(9, 2013)) {
            System.out.println(t);
        }
    }
}
