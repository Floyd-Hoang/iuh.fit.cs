/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 8:44:59 PM
 */

package chuong3.bai3;

/**
 * 
 */
import java.util.*;

public class SoftwareHouse {
    private String theName;
    private List<Employee> listStaff;

    public SoftwareHouse(String theName) {
        this.theName    = theName;
        this.listStaff = new ArrayList<>();
    }

    public boolean addEmployee(Employee emp) {
        for (Employee e : listStaff) {
            if (e.getThePayrollNumber() == emp.getThePayrollNumber()) {
                return false;
            }
        }
        return listStaff.add(emp);
    }

    public void displayAllStaff() {
        System.out.printf("Company: %s%n", theName);
        System.out.println("+------+----------------------+---------------+----------------+-----------------+");
        System.out.printf("| %-4s | %-20s | %13s | %14s | %15s |%n",
            "ID", "Name", "Basic Salary", "Monthly Salary", "Role");
        System.out.println("+------+----------------------+---------------+----------------+-----------------+");
        for (Employee e : listStaff) {
            String role = e.getClass().getSimpleName();
            System.out.printf("| %4d | %-20s | %,13.0f | %,14.0f | %-15s |%n",
                e.getThePayrollNumber(),
                e.getTheName(),
                e.getBasicMonthlySalary(),
                e.getMonthlySalary(),
                role);
        }
        System.out.println("+------+----------------------+---------------+----------------+-----------------+");
    }


    public double getMonthlySalaryBill() {
        double total = 0;
        for (Employee e : listStaff) {
            total += e.getMonthlySalary();
        }
        return total;
    }

    public void sortAllStaffByName() {
        listStaff.sort(Comparator.comparing(Employee::getTheName));
    }

    public void displayListProgrammers() {
        System.out.printf("Programmers in %s:%n", theName);
        System.out.println("+------+----------------------+---------------+----------------+-----------------+----------------+");
        System.out.printf("| %-4s | %-20s | %13s | %14s | %-15s | %-14s |%n",
            "ID", "Name", "Basic Salary", "Monthly Salary", "Role", "Language");
        System.out.println("+------+----------------------+---------------+----------------+-----------------+----------------+");
        for (Employee e : listStaff) {
            if (e instanceof Programmer) {
                Programmer p = (Programmer) e;
                System.out.printf("| %4d | %-20s | %,13.0f | %,14.0f | %-15s | %-14s |%n",
                    p.getThePayrollNumber(),
                    p.getTheName(),
                    p.getBasicMonthlySalary(),
                    p.getMonthlySalary(),
                    "Programmer",
                    p.getTheLanguage());
            }
        }
        System.out.println("+------+----------------------+---------------+----------------+-----------------+----------------+");
    }


    public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
        for (Employee e : listStaff) {
            if (e instanceof Administrator &&
                e.getThePayrollNumber() == aPayrollNo) {
                ((Administrator)e).setTheDepartment(deptNew);
                return true;
            }
        }
        return false;
    }
}

