/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 4:03:32 PM
 */

package chuong3.bai10;

/**
 * 
 */
public class Student extends Person {
    private double score1;
    private double score2;

    public Student() {
    }

    public Student(String name, String address, double score1, double score2) {
        super(name, address);
        this.score1 = score1;
        this.score2 = score2;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double average() {
        return (score1 + score2) / 2.0;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-25s %8.1f %8.1f %8.1f %-15s %-15s %-10s",
                getName(), getAddress(), score1, score2, average(), 
                "", "", "Student");
    }
}
