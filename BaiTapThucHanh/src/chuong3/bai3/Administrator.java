/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 8:43:50 PM
 */

package chuong3.bai3;

/**
 * 
 */
public class Administrator extends Employee {
    private String theDepartment;

    public Administrator(int thePayrollNumber, String theName,
                         double theBasicMonthlySalary, String theDepartment) {
        super(thePayrollNumber, theName, theBasicMonthlySalary);
        this.theDepartment = theDepartment;
    }

    public String getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(String theDepartment) {
        this.theDepartment = theDepartment;
    }

    @Override
    public double getMonthlySalary() {
        return getBasicMonthlySalary() * 1.4;
    }

    @Override
    public String toString() {
        return String.format("%s | %-12s", super.toString(), theDepartment);
    }
}

