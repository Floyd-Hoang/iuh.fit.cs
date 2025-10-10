/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 8:45:28 PM
 */

package chuong3.bai3;

/**
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoftwareHouse sh = new SoftwareHouse("MySoftwareCo");
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU SoftwareHouse ===");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị tất cả nhân viên");
            System.out.println("3. Tính tổng lương tháng");
            System.out.println("4. Sắp xếp nhân viên theo tên");
            System.out.println("5. Hiển thị lập trình viên");
            System.out.println("6. Cập nhật phòng ban Admin");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Loại (1-Programmer,2-Admin,3-ProjectLeader): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Lương cơ bản: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    Employee emp = null;
                    if (type == 1) {
                        System.out.print("Ngôn ngữ: ");
                        String lang = scanner.nextLine();
                        emp = new Programmer(id, name, salary, lang);
                    } else if (type == 2) {
                        System.out.print("Phòng ban: ");
                        String dept = scanner.nextLine();
                        emp = new Administrator(id, name, salary, dept);
                    } else if (type == 3) {
                        emp = new ProjectLeader(id, name, salary, "");
                    }
                    if (emp != null && sh.addEmployee(emp)) {
                        System.out.println("Thêm thành công");
                    } else {
                        System.out.println("Thêm thất bại (trùng ID)");
                    }
                    break;

                case 2:
                    sh.displayAllStaff();
                    break;

                case 3:
                    System.out.printf("Tổng lương tháng: %,12.0f%n",
                                      sh.getMonthlySalaryBill());
                    break;

                case 4:
                    sh.sortAllStaffByName();
                    System.out.println("Đã sắp xếp xong");
                    break;

                case 5:
                    sh.displayListProgrammers();
                    break;

                case 6:
                    System.out.print("ID Admin cần cập nhật: ");
                    int aid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Phòng mới: ");
                    String newDept = scanner.nextLine();
                    if (sh.updateDepartmentForAdmin(aid, newDept)) {
                        System.out.println("Cập nhật thành công");
                    } else {
                        System.out.println("Không tìm thấy hoặc không phải Admin");
                    }
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);

        scanner.close();
    }
}

