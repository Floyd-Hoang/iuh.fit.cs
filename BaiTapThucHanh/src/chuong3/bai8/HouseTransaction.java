/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 10:09:18 PM
 */

package chuong3.bai8;

/**
 * 
 */
import java.util.Date;

public class HouseTransaction extends Transaction {
    private String houseType; 
    private String address;

    public HouseTransaction(String transactionID, Date transactionDate,
                            double unitPrice, double area,
                            String houseType, String address) {
        super(transactionID, transactionDate, unitPrice, area);
        this.houseType = houseType;
        this.address   = address;
    }

    @Override
    public double getTotalAmount() {
        if ("cao cấp".equalsIgnoreCase(houseType)) {
            return area * unitPrice;
        }
        return area * unitPrice * 0.9;
    }

    @Override
    public String getType() {
        return "Nhà";
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(" %-3s %-8s %-20s %,15.0f",
                   getType(), houseType, address, getTotalAmount());
    }
}

