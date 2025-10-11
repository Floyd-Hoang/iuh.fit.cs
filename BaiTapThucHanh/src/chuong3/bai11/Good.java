/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 5:07:41 PM
 */

package chuong3.bai11;

/**
 * 
 */
public abstract class Good {
    private String id;
    private String name;
    private int quantity;
    private double unitPrice;

    public Good(String id, String name, int quantity, double unitPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double vatRate();

    public abstract String type();

    public abstract String extraInfo();

    public abstract String rating();

    public double totalValue() {
        return quantity * unitPrice * (1 + vatRate());
    }

    @Override
    public String toString() {
        return String.format("%-6s %-15s %8d %,10.0f %6.1f%% %-15s %-10s %,12.0f",
                id, name, quantity, unitPrice, vatRate() * 100,
                extraInfo(), type(), totalValue());
    }
}

