/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 8:43:29 PM
 */

package chuong3.bai3;

/**
 * 
 */
public class Programmer extends Employee {
    private String theLanguage;

    public Programmer(int thePayrollNumber, String theName,
                      double theBasicMonthlySalary, String theLanguage) {
        super(thePayrollNumber, theName, theBasicMonthlySalary);
        this.theLanguage = theLanguage;
    }

    public String getTheLanguage() {
        return theLanguage;
    }

    public void setTheLanguage(String theLanguage) {
        this.theLanguage = theLanguage;
    }

    @Override
    public double getMonthlySalary() {
        double base = getBasicMonthlySalary();
        if ("Java".equalsIgnoreCase(theLanguage)) {
            return base * 1.2;
        }
        return base;
    }

    @Override
    public String toString() {
        return String.format("%s | %-8s", super.toString(), theLanguage);
    }
}
