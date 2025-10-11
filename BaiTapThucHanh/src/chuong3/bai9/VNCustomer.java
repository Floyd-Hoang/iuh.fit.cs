/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:14:59 PM
 */

package chuong3.bai9;

/**
 * 
 */
import java.util.Date;

public class VNCustomer extends Customer {
    private double quota; 

    public VNCustomer(String customerID, String name, Date invoiceDate,
                      double unitPrice, double quantity, double quota) {
        super(customerID, name, invoiceDate, unitPrice, quantity);
        this.quota = quota;
    }

    @Override
    public double calcAmount() {
        if (quantity <= quota) {
            return quantity * unitPrice;
        } else {
            return quota * unitPrice
                 + (quantity - quota) * unitPrice * 2.5;
        }
    }

    @Override
    public String getType() {
        return "VN";
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(" %-4s %,12.0f", getType(), calcAmount());
    }
}
