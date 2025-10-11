/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 4:04:22 PM
 */

package chuong3.bai10;

/**
 * 
 */
public class Customer extends Person {
    private String companyName;
    private double invoiceAmount;

    public Customer() {
    }

    public Customer(String name, String address, String companyName, double invoiceAmount) {
        super(name, address);
        this.companyName = companyName;
        this.invoiceAmount = invoiceAmount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-25s %8s %8s %8s %-15s %15.0f %-10s",
                getName(), getAddress(), "", "", "", 
                companyName, invoiceAmount, "Customer");
    }
}
