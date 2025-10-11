/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:57:43 AM
 */

package chuong3.bai7;

/**
 * 
 */
import java.util.Date;

public class GoldTransaction extends Transaction {
    public GoldTransaction(String transactionID, Date transactionDate,
                           double unitPrice, double quantity) {
        super(transactionID, transactionDate, unitPrice, quantity);
    }

    @Override
    public double getTotalAmount() {
        return unitPrice * quantity;
    }

    @Override
    public String getType() {
        return "Vàng";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10s %,15.0f",
            getType(), getTotalAmount());
    }
}

