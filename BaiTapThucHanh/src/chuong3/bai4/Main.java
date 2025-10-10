/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 10:00:53 PM
 */

package chuong3.bai4;

/**
 * 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Faculty f = new Faculty("Lê", "Kim Khánh", "CNTT", "H5.01");

        Student s1 = new Student("Hoàng", "Dũng",   "140211", 2014);
        Student s2 = new Student("Trần",  "Bình",   "140511", 2014);
        Student s3 = new Student("Lê",    "Huỳnh",  "140811", 2014);
        Student s4 = new Student("Hồ",    "Huyền",  "140611", 2013);

        Course c = new Course("0602", "OOP - Lập trình hướng đối tượng (4TC)", 3);

        Set<Enrolment> enrolls = new LinkedHashSet<>();
        enrolls.add(new Enrolment("Active", "A", 8.5f, s1));
        enrolls.add(new Enrolment("Active", "A+",9.5f, s2));
        enrolls.add(new Enrolment("Active", "B+",7.0f, s3));
        enrolls.add(new Enrolment("Active", "C", 5.5f, s4));

        c.addSection("01", "2015-2016", "H5.01", f, enrolls);

        System.out.println("Khóa học  : [" + c.getCourseNbr() + "] - " + c.getCourseTitle());
        System.out.println("===== Thông tin học phần =====");
        System.out.printf("Mã học phần: %s%n", c.getCourseNbr());
        System.out.printf("Học kỳ     : %s%n", "2015-2016");
        System.out.printf("Phòng học  : %s%n", "H5.01");
        System.out.printf("Giảng viên : %s %s (Khoa: %s)%n",
                          f.getFirstName(), f.getLastName(), f.getFacultyID());
        System.out.println("===== Danh sách sinh viên =====");
        System.out.printf("%-8s %-15s %-6s %6s%n",
                          "Mã SV", "Họ tên", "Khóa", "Điểm");
        for (Enrolment e : enrolls) {
            System.out.println(e.toRowString());
        }
        System.out.printf("%nTổng số sinh viên : %d%n", enrolls.size());
    }
}

