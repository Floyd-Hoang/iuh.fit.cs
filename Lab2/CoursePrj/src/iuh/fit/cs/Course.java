/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 30-Aug-2025 12:16:53 PM
 */

package iuh.fit.cs;

/**
 * 
 */

public class Course {
    private String id;
    private String title;
    private int credit;
    private String department;

    public Course(String id, String title, int credit, String department) {
        setId(id);
        setTitle(title);
        setCredit(credit);
        setDepartment(department);
    }

    public String getId() { return id; }

    public void setId(String id) {
        if (id == null) throw new IllegalArgumentException("ID must not be null");
        String trimmed = id.trim();
        if (trimmed.length() < 3) throw new IllegalArgumentException("ID must have at least 3 characters");
        if (!trimmed.matches("[A-Za-z0-9]+")) throw new IllegalArgumentException("ID must contain only letters or digits");
        this.id = trimmed;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Title must not be null");
        if (title.trim().isEmpty()) throw new IllegalArgumentException("Title must not be empty");
        this.title = title.trim();
    }

    public int getCredit() { return credit; }

    public void setCredit(int credit) {
        if (credit <= 0) throw new IllegalArgumentException("Credit must be greater than 0");
        this.credit = credit;
    }

    public String getDepartment() { return department; }

    public void setDepartment(String department) {
        if (department == null) department = "";
        this.department = department.trim();
    }

    @Override
    public String toString() {
        return String.format("%-8s | %-30s | %3d | %-15s", id, title, credit, department);
    }
}

