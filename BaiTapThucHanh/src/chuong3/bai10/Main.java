/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 4:06:13 PM
 */

package chuong3.bai10;

/**
 * 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mgr = new Manager(5);

        int choice;
        do {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("          MENU QUẢN LÝ NGƯỜI");
            System.out.println("=".repeat(50));
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Thêm khách hàng");
            System.out.println("4. Xóa theo tên");
            System.out.println("5. Sắp xếp theo tên");
            System.out.println("6. Hiển thị tất cả");
            System.out.println("0. Thoát");
            System.out.println("=".repeat(50));
            System.out.print("Chọn chức năng: ");
            
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Thêm sinh viên ---");
                    System.out.print("Họ tên: ");
                    String studentName = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String studentAddress = sc.nextLine();
                    System.out.print("Điểm môn 1: ");
                    double score1 = sc.nextDouble();
                    System.out.print("Điểm môn 2: ");
                    double score2 = sc.nextDouble();
                    sc.nextLine();
                    
                    mgr.add(new Student(studentName, studentAddress, score1, score2));
                    System.out.println("Thêm sinh viên thành công!");
                    break;

                case 2:
                    System.out.println("\n--- Thêm nhân viên ---");
                    System.out.print("Họ tên: ");
                    String empName = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String empAddress = sc.nextLine();
                    System.out.print("Hệ số lương: ");
                    double coefficient = sc.nextDouble();
                    sc.nextLine();
                    
                    mgr.add(new Employee(empName, empAddress, coefficient));
                    System.out.println("Thêm nhân viên thành công!");
                    break;

                case 3:
                    System.out.println("\n--- Thêm khách hàng ---");
                    System.out.print("Họ tên: ");
                    String custName = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String custAddress = sc.nextLine();
                    System.out.print("Tên công ty: ");
                    String company = sc.nextLine();
                    System.out.print("Số tiền hóa đơn: ");
                    double invoice = sc.nextDouble();
                    sc.nextLine();
                    
                    mgr.add(new Customer(custName, custAddress, company, invoice));
                    System.out.println("Thêm khách hàng thành công!");
                    break;

                case 4:
                    System.out.println("\n--- Xóa người ---");
                    System.out.print("Nhập tên cần xóa: ");
                    String removeName = sc.nextLine();
                    if (mgr.remove(removeName)) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Không tìm thấy người có tên này!");
                    }
                    break;

                case 5:
                    mgr.sortByName();
                    System.out.println("Đã sắp xếp theo tên!");
                    break;

                case 6:
                    mgr.displayAll();
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        sc.close();
    }
}
