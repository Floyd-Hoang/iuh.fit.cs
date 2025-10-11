/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:16:39 PM
 */

package chuong3.bai9;

/**
 * 
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InvoiceManager mgr = new InvoiceManager();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        mgr.add(new VNCustomer("VN01", "Nguyen A", fmt.parse("05/09/2013"),
                   1500,  50,  40));
        mgr.add(new VNCustomer("VN02", "Tran B",   fmt.parse("10/09/2013"),
                   1500, 100,  40));
        mgr.add(new ForeignCustomer("FR01", "John C", fmt.parse("15/09/2013"),
                   2000,   30, "USA"));
        mgr.add(new ForeignCustomer("FR02", "Anna D", fmt.parse("20/08/2013"),
                   2500,   20, "UK"));

        mgr.displayAll();

        Map<String, Long> cnt = mgr.countByType();
        System.out.println("Số hóa đơn VN: " + cnt.getOrDefault("VN", 0L));
        System.out.println("Số hóa đơn Foreign: " + cnt.getOrDefault("Foreign", 0L));

        System.out.printf("Trung bình HĐ Foreign: %, .0f%n", mgr.avgForeignAmount());

        System.out.println("Hóa đơn tháng 09/2013:");
        for (Customer c : mgr.invoicesInMonth(9, 2013)) {
            System.out.println(c);
        }
    }
}
