/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 5:10:38 PM
 */

package chuong3.bai11;

/**
 * 
 */
import java.util.*;

public class Warehouse {
    private List<Good> goods;

    public Warehouse() {
        goods = new ArrayList<>();
    }

    public void add(Good good) {
        for (Good g : goods) {
            if (g.getId().equals(good.getId())) {
                return;
            }
        }
        goods.add(good);
    }

    public void displayAll() {
        System.out.printf("%-6s %-15s %8s %10s %8s %-15s %-10s %12s%n",
                "ID", "Name", "Qty", "UnitPrice", "VAT", "Extra", "Type", "TotalValue");
        System.out.println("=".repeat(100));

        for (Good good : goods) {
            System.out.println(good);
        }
        System.out.println("=".repeat(100));
    }

    public Map<String, Long> countByType() {
        Map<String, Long> typeCount = new HashMap<>();
        for (Good good : goods) {
            String type = good.type();
            typeCount.put(type, typeCount.getOrDefault(type, 0L) + 1);
        }
        return typeCount;
    }

    public double averagePerishableValue() {
        double sum = 0;
        int count = 0;
        for (Good good : goods) {
            if (good instanceof Perishable) {
                sum += good.totalValue();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    public List<Good> getDifficultGoods() {
        List<Good> difficult = new ArrayList<>();
        for (Good good : goods) {
            if ("Difficult".equals(good.rating())) {
                difficult.add(good);
            }
        }
        return difficult;
    }
}

