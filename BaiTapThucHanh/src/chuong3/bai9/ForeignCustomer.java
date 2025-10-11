/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:15:20 PM
 */

package chuong3.bai9;

/**
 * 
 */
import java.util.Date;

public class ForeignCustomer extends Customer {
    private String nationality;

    public ForeignCustomer(String customerID, String name, Date invoiceDate,
                           double unitPrice, double quantity, String nationality) {
        super(customerID, name, invoiceDate, unitPrice, quantity);
        this.nationality = nationality;
    }

    @Override
    public double calcAmount() {
        return quantity * unitPrice;
    }

    @Override
    public String getType() {
        return "Foreign";
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(" %-8s %-10s %,12.0f",
                   getType(), nationality, calcAmount());
    }
}

