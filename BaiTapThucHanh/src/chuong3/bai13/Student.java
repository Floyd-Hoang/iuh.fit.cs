/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:46:48 PM
 */

package chuong3.bai13;

/**
 * 
 */
public abstract class Student extends Person {
    public Student() { }

    public Student(String name, String address) {
        super(name, address);
    }

    public abstract String getLevel();

    @Override
    public String toString() {
        return String.format("%s %-20s", super.toString(), getLevel());
    }
}

