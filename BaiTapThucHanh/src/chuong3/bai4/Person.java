/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 9:56:09 PM
 */

package chuong3.bai4;

/**
 * 
 */
public class Person {
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName  = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10s", lastName, firstName);
    }
}
