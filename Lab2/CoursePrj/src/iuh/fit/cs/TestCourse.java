/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 30-Aug-2025 12:18:11 PM
 */

package iuh.fit.cs;

/**
 * 
 */
import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseList list = new CourseList(50);
        initData(list);

        while (true) {
            showMenu();
            System.out.print("Lua chon: ");
            String ch = sc.nextLine().trim();
            switch (ch) {
                case "1": addCourseInteractive(list, sc); break;
                case "2": removeInteractive(list, sc); break;
                case "3": printCourses(list.getCourses()); break;
                case "4": searchByIdInteractive(list, sc); break;
                case "5": searchByTitleInteractive(list, sc); break;
                case "6": searchByDepartmentInteractive(list, sc); break;
                case "7": printMaxCreditCourses(list); break;
                case "8": printDepartmentWithMost(list); break;
                case "9": printSortedByTitle(list); break;
                case "0": System.out.println("Thoat."); sc.close(); return;
                default: System.out.println("Lua chon khong hop le.");
            }
            System.out.println();
        }
    }

    private static void showMenu() {
        System.out.println("=== COURSE LIST MENU ===");
        System.out.println("1. Add a course");
        System.out.println("2. Remove a course by ID");
        System.out.println("3. Print all courses");
        System.out.println("4. Search course by ID");
        System.out.println("5. Search courses by title (partial)");
        System.out.println("6. Search courses by department");
        System.out.println("7. Find courses with max credit");
        System.out.println("8. Find department with most courses");
        System.out.println("9. Print courses sorted by title (copy)");
        System.out.println("0. Exit");
    }

    private static void addCourseInteractive(CourseList list, Scanner sc) {
        try {
            System.out.print("ID: "); String id = sc.nextLine();
            System.out.print("Title: "); String title = sc.nextLine();
            System.out.print("Credit (int): "); int credit = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Department: "); String dept = sc.nextLine();
            Course c = new Course(id, title, credit, dept);
            if (list.addCourse(c)) System.out.println("Added.");
            else System.out.println("Cannot add. Either capacity full or ID existed.");
        } catch (NumberFormatException e) {
            System.out.println("Credit must be an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removeInteractive(CourseList list, Scanner sc) {
        System.out.print("ID to remove: ");
        String id = sc.nextLine();
        if (list.removeCourse(id)) System.out.println("Removed.");
        else System.out.println("Course not found.");
    }

    private static void searchByIdInteractive(CourseList list, Scanner sc) {
        System.out.print("ID to search: ");
        Course c = list.searchCourseById(sc.nextLine());
        if (c == null) System.out.println("Not found.");
        else {
            printHeader();
            System.out.println(c);
        }
    }

    private static void searchByTitleInteractive(CourseList list, Scanner sc) {
        System.out.print("Title keyword: ");
        Course[] arr = list.searchCourseByTitle(sc.nextLine());
        if (arr == null) System.out.println("No match.");
        else printCourses(arr);
    }

    private static void searchByDepartmentInteractive(CourseList list, Scanner sc) {
        System.out.print("Department: ");
        Course[] arr = list.searchCourseByDepartment(sc.nextLine());
        if (arr == null) System.out.println("No match.");
        else printCourses(arr);
    }

    private static void printMaxCreditCourses(CourseList list) {
        Course[] arr = list.findMaxCreditCourse();
        if (arr == null) System.out.println("No courses.");
        else {
            System.out.println("Max credit course(s):");
            printCourses(arr);
        }
    }

    private static void printDepartmentWithMost(CourseList list) {
        String dept = list.findDepartmentWithMostCourse();
        if (dept == null) System.out.println("No courses.");
        else System.out.println("Department with most courses: " + dept);
    }

    private static void printSortedByTitle(CourseList list) {
        Course[] sorted = list.sortCoursesByTitle();
        System.out.println("Sorted copy by title:");
        printCourses(sorted);
    }

    private static void printHeader() {
        System.out.printf("%-8s | %-30s | %s | %-15s%n", "ID", "Title", "Cr", "Department");
        System.out.println("---------------------------------------------------------------------");
    }

    private static void printCourses(Course[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("[No courses]");
            return;
        }
        printHeader();
        for (Course c : arr) System.out.println(c);
    }

    private static void initData(CourseList list) {
        try {
            list.addCourse(new Course("CS101", "Introduction to Programming", 3, "CS"));
            list.addCourse(new Course("CS102", "Data Structures", 4, "CS"));
            list.addCourse(new Course("EE201", "Circuit Theory", 3, "EE"));
            list.addCourse(new Course("MA101", "Calculus I", 4, "Math"));
            list.addCourse(new Course("CS201", "Algorithms", 4, "CS"));
        } catch (IllegalArgumentException ignored) {}
    }
}
