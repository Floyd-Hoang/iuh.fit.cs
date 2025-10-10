/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 9:57:04 PM
 */

package chuong3.bai4;

/**
 * 
 */
public class Faculty extends Person {
    private String office;
    private String facultyID;

    public Faculty(String lastName, String firstName, String facultyID, String office) {
        super(lastName, firstName);
        this.facultyID = facultyID;
        this.office    = office;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %-6s", facultyID, super.toString(), office);
    }
}
