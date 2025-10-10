/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 8:44:32 PM
 */

package chuong3.bai3;

/**
 * 
 */
public class ProjectLeader extends Employee {

    public ProjectLeader(int thePayrollNumber, String theName,
                         double theBasicMonthlySalary, String unused) {
        super(thePayrollNumber, theName, theBasicMonthlySalary);
    }

    @Override
    public double getMonthlySalary() {
        return getBasicMonthlySalary() * 1.2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

