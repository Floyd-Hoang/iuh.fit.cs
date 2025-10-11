/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:48:33 PM
 */

package chuong3.bai13;

/**
 * 
 */
public class UniversityStudent extends Student {
    private String faculty;
    private int year;

    public UniversityStudent(String name, String address, String faculty, int year) {
        super(name, address);
        this.faculty = faculty;
        this.year    = year;
    }

    @Override
    public String getLevel() {
        return "University (" + faculty + " " + year + ")";
    }
}

