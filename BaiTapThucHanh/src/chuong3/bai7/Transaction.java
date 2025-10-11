/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:57:07 AM
 */

package chuong3.bai7;

/**
 * 
 */
import java.util.Date;

public abstract class Transaction {
    protected String transactionID;
    protected Date   transactionDate;
    protected double unitPrice;
    protected double quantity;

    public Transaction(String transactionID, Date transactionDate,
                       double unitPrice, double quantity) {
        this.transactionID   = transactionID;
        this.transactionDate = transactionDate;
        this.unitPrice       = unitPrice;
        this.quantity        = quantity;
    }

    public String getTransactionID() { return transactionID; }
    public Date   getTransactionDate() { return transactionDate; }
    public double getUnitPrice() { return unitPrice; }
    public double getQuantity() { return quantity; }

    public abstract double getTotalAmount();
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%-10s %-12tF %-15.0f %-15.2f",
            transactionID, transactionDate, unitPrice, quantity);
    }
}

