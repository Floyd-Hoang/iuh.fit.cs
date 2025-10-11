/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:50:04 PM
 */

package chuong3.bai13;

/**
 * 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager mgr = new StudentManager();
        int choice;

        do {
            System.out.println("\n1.Vocational  2.College  3.University  4.Linked");
            System.out.println("5.Display All  0.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String n1 = sc.nextLine();
                    System.out.print("Address: ");
                    String a1 = sc.nextLine();
                    System.out.print("Duration (months): ");
                    int m = sc.nextInt(); sc.nextLine();
                    mgr.addStudent(new VocationalStudent(n1, a1, m));
                    break;

                case 2:
                    System.out.print("Name: ");
                    String n2 = sc.nextLine();
                    System.out.print("Address: ");
                    String a2 = sc.nextLine();
                    System.out.print("Major: ");
                    String mj = sc.nextLine();
                    mgr.addStudent(new CollegeStudent(n2, a2, mj));
                    break;

                case 3:
                    System.out.print("Name: ");
                    String n3 = sc.nextLine();
                    System.out.print("Address: ");
                    String a3 = sc.nextLine();
                    System.out.print("Faculty: ");
                    String f = sc.nextLine();
                    System.out.print("Year: ");
                    int y = sc.nextInt(); sc.nextLine();
                    mgr.addStudent(new UniversityStudent(n3, a3, f, y));
                    break;

                case 4:
                    System.out.print("Name: ");
                    String n4 = sc.nextLine();
                    System.out.print("Address: ");
                    String a4 = sc.nextLine();
                    System.out.print("Partner Country: ");
                    String c = sc.nextLine();
                    mgr.addStudent(new LinkedStudent(n4, a4, c));
                    break;

                case 5:
                    mgr.displayAll();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}

