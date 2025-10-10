/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 12:42:50 AM
 */

package chuong3.bai5;

/**
 * 
 */
import java.util.*;

public class TripManager {
    private List<Vehicle> list = new ArrayList<>();

    public void addTrip(Vehicle v) {
        list.add(v);
    }

    public void displayAll() {
        System.out.println("\n================ DANH SÁCH CHUYẾN XE ================");
        System.out.println(String.format("%-8s | %-15s | %-10s | %-10s | %-10s | %-10s | %-10s",
            "Mã", "Tài xế", "Biển số", "Doanh thu", "Tuyến/Nơi đến", "Km/Ngày", "Loại"));
        System.out.println("-------------------------------------------------------------------------------");
        for (Vehicle v : list) {
            System.out.println(v.toString());
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    public double totalRevenueByType(String type) {
        double total = 0;
        for (Vehicle v : list) {
            if (v.getType().equals(type)) total += v.getRevenue();
        }
        return total;
    }
}
