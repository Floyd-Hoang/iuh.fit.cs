/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 7:38:13 PM
 */

package chuong3.bai2;

/**
 * 
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Order order = new Order(1, fmt.parse("10/09/2015"));

        Product p1 = new Product("sp1", "Nước tương", 8000);
        Product p2 = new Product("sp2", "Gạo",     18000);
        Product p3 = new Product("sp3", "Đường",   10000);

        order.addLineItem(p1, 10);
        order.addLineItem(p2,  5);
        order.addLineItem(p3,  1);
        order.addLineItem(p2,  1);

        System.out.println(order);
    }
}
