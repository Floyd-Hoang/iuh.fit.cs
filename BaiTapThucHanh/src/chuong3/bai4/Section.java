/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 9:59:41 PM
 */

package chuong3.bai4;

/**
 * 
 */
import java.util.*;

public class Section {
    private String semester;
    private String sectionNbr;
    private String room;
    private Faculty facultyMember;
    private Set<Enrolment> listEnrolls;

    public Section(String sectionNbr, String semester, String room, Faculty facultyMember, Set<Enrolment> listEnrolls) {
        this.sectionNbr    = sectionNbr;
        this.semester      = semester;
        this.room          = room;
        this.facultyMember = facultyMember;
        this.listEnrolls   = listEnrolls;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSectionNbr() {
        return sectionNbr;
    }

    public void setSectionNbr(String sectionNbr) {
        this.sectionNbr = sectionNbr;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Faculty getFacultyMember() {
        return facultyMember;
    }

    public void setFacultyMember(Faculty facultyMember) {
        this.facultyMember = facultyMember;
    }

    public Set<Enrolment> getListEnrolls() {
        return listEnrolls;
    }
}

