/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 9:02:54 PM
 */

package chuong3.bai7;

/**
 * 
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        TransactionManager mgr = new TransactionManager();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        mgr.add(new GoldTransaction("GD01", fmt.parse("01/10/2025"), 60000000, 0.5));
        mgr.add(new GoldTransaction("GD02", fmt.parse("02/10/2025"), 61000000, 1.2));
        mgr.add(new CurrencyTransaction("GD03", fmt.parse("03/10/2025"), 23000, 1000, "VND", 1));
        mgr.add(new CurrencyTransaction("GD04", fmt.parse("04/10/2025"), 22, 200000, "USD", 23000));
        mgr.add(new CurrencyTransaction("GD05", fmt.parse("05/10/2025"), 25, 150, "EUR", 25000));

        mgr.displayAll();

        Map<String, Long> counts = mgr.countByType();
        System.out.println("Số giao dịch vàng: " + counts.getOrDefault("Vàng", 0L));
        System.out.println("Số giao dịch tiền tệ: " + counts.getOrDefault("Tiền tệ", 0L));

        System.out.printf("Trung bình thành tiền tiền tệ: %, .0f%n",
                          mgr.averageCurrencyAmount());

        System.out.println("Giao dịch > 1 tỷ:");
        for (Transaction t : mgr.transactionsOver(1_000_000_000)) {
            System.out.println(t);
        }
    }
}

