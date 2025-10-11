/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 10:08:54 PM
 */

package chuong3.bai8;

/**
 * 
 */
import java.util.Date;

public abstract class Transaction {
    protected String transactionID;
    protected Date   transactionDate;
    protected double unitPrice;
    protected double area;

    public Transaction(String transactionID, Date transactionDate,
                       double unitPrice, double area) {
        this.transactionID   = transactionID;
        this.transactionDate = transactionDate;
        this.unitPrice       = unitPrice;
        this.area            = area;
    }

    public String getTransactionID() { return transactionID; }
    public Date   getTransactionDate() { return transactionDate; }
    public double getUnitPrice() { return unitPrice; }
    public double getArea() { return area; }

    public abstract double getTotalAmount();
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%-10s %-12tF %12.0f %8.2f", 
            transactionID, transactionDate, unitPrice, area);
    }
}

