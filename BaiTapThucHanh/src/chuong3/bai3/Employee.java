/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 8:42:58 PM
 */

package chuong3.bai3;

/**
 * 
 */
public abstract class Employee {
    private final int thePayrollNumber;
    private String theName;
    private double theBasicMonthlySalary;

    public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
        this.thePayrollNumber     = thePayrollNumber;
        this.theName              = theName;
        this.theBasicMonthlySalary = theBasicMonthlySalary;
    }

    public int getThePayrollNumber() {
        return thePayrollNumber;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    public double getBasicMonthlySalary() {
        return theBasicMonthlySalary;
    }

    public void setBasicMonthlySalary(double theBasicMonthlySalary) {
        this.theBasicMonthlySalary = theBasicMonthlySalary;
    }

    public abstract double getMonthlySalary();

    @Override
    public String toString() {
        return String.format("%-5d | %-15s | %,12.0f | %,12.0f",
                             thePayrollNumber, theName,
                             theBasicMonthlySalary, getMonthlySalary());
    }
}
