/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 4:04:01 PM
 */

package chuong3.bai10;

/**
 * 
 */
public class Employee extends Person {
    private double salaryCoefficient;

    public Employee() {
    }

    public Employee(String name, String address, double salaryCoefficient) {
        super(name, address);
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double salary() {
        return salaryCoefficient * 1500000;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-25s %8s %8s %8s %-15.2f %15.0f %-10s",
                getName(), getAddress(), "", "", "", 
                salaryCoefficient, salary(), "Employee");
    }
}
