/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 11:14:31 PM
 */

package chuong3.bai9;

/**
 * 
 */
import java.util.Date;

public abstract class Customer {
    protected String customerID;
    protected String name;
    protected Date invoiceDate;
    protected double unitPrice;
    protected double quantity;

    public Customer(String customerID, String name, Date invoiceDate,
                    double unitPrice, double quantity) {
        this.customerID  = customerID;
        this.name        = name;
        this.invoiceDate = invoiceDate;
        this.unitPrice   = unitPrice;
        this.quantity    = quantity;
    }

    public String getCustomerID() { return customerID; }
    public String getName()       { return name; }
    public Date   getInvoiceDate(){ return invoiceDate; }
    public double getUnitPrice()  { return unitPrice; }
    public double getQuantity()   { return quantity; }

    public abstract double calcAmount();
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%-8s %-15s %-10tF %,10.0f %10.2f",
            customerID, name, invoiceDate, unitPrice, quantity);
    }
}

