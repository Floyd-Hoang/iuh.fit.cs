/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 9:56:34 PM
 */

package chuong3.bai4;

/**
 * 
 */
public class Student extends Person {
    private int yearMatriculated;
    private String studentID;

    public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
        super(lastName, firstName);
        this.studentID       = studentID;
        this.yearMatriculated = yearMatriculated;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getYearMatriculated() {
        return yearMatriculated;
    }

    public void setYearMatriculated(int yearMatriculated) {
        this.yearMatriculated = yearMatriculated;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %4d", studentID, super.toString(), yearMatriculated);
    }
}
