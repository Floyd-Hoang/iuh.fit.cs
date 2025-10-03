/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 11:55:56 PM
 */

package chuong2.bai3;

/**
 * 
 */
import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle xe1 = null, xe2 = null, xe3 = null;
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập thông tin 3 xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin xe 1:");
                    xe1 = nhapXe(sc);
                    System.out.println("Nhập thông tin xe 2:");
                    xe2 = nhapXe(sc);
                    System.out.println("Nhập thông tin xe 3:");
                    xe3 = nhapXe(sc);
                    break;

                case 2:
                    System.out.printf("%-20s %-15s %10s %15s %15s\n",
                            "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                    System.out.println("----------------------------------------------------------------------------");
                    if (xe1 != null) System.out.println(xe1);
                    if (xe2 != null) System.out.println(xe2);
                    if (xe3 != null) System.out.println(xe3);
                    break;

                case 3:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 3);

        sc.close();
    }

    private static Vehicle nhapXe(Scanner sc) {
        System.out.print("Tên chủ xe: ");
        String chuxe = sc.nextLine();
        System.out.print("Loại xe: ");
        String loaixe = sc.nextLine();
        System.out.print("Dung tích: ");
        int dungtich = sc.nextInt();
        System.out.print("Trị giá: ");
        double trigia = sc.nextDouble();
        sc.nextLine(); 
        return new Vehicle(chuxe, loaixe, dungtich, trigia);
    }
}
