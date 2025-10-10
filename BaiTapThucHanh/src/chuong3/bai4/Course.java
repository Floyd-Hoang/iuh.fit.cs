/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 9:58:34 PM
 */

package chuong3.bai4;

/**
 * 
 */
import java.util.*;

public class Course {
    private String courseNbr;
    private String courseTitle;
    private int credits;
    private Set<Section> sections;

    public Course(String courseNbr, String courseTitle, int credits) {
        this.courseNbr   = courseNbr;
        this.courseTitle = courseTitle;
        this.credits     = credits;
        this.sections    = new HashSet<>();
    }

    public String getCourseNbr() {
        return courseNbr;
    }

    public void setCourseNbr(String courseNbr) {
        this.courseNbr = courseNbr;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void addSection(String sectionNbr, String semester, String room, Faculty facultyMember, Set<Enrolment> listEnrolls) {
        Section sec = new Section(sectionNbr, semester, room, facultyMember, listEnrolls);
        sections.add(sec);
    }

    public int getNbrStudents(String sectionNbr) {
        for (Section s : sections) {
            if (s.getSectionNbr().equals(sectionNbr)) {
                return s.getListEnrolls().size();
            }
        }
        return 0;
    }

    public Set<Section> getSections() {
        return sections;
    }
}

