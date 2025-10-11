/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 10:09:07 PM
 */

package chuong3.bai8;

/**
 * 
 */
import java.util.Date;

public class LandTransaction extends Transaction {
    private String landType; 
    public LandTransaction(String transactionID, Date transactionDate,
                           double unitPrice, double area, String landType) {
        super(transactionID, transactionDate, unitPrice, area);
        this.landType = landType;
    }

    @Override
    public double getTotalAmount() {
        if ("A".equalsIgnoreCase(landType)) {
            return area * unitPrice * 1.5;
        }
        return area * unitPrice;
    }

    @Override
    public String getType() {
        return "Đất";
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(" %-3s %-6s %,15.0f", 
                   getType(), landType, getTotalAmount());
    }
}

