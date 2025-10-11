/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:49:35 PM
 */

package chuong3.bai13;

/**
 * 
 */
import java.util.*;

public class StudentManager {
    private List<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        list.add(s);
    }

    public void displayAll() {
        System.out.printf("%-20s %-30s %-20s%n", "Name", "Address", "Level");
        System.out.println("=".repeat(75));
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("=".repeat(75));
    }
}

