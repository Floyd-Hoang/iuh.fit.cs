/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 12:59:07 AM
 */

package chuong3.bai5;

/**
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TripManager mgr = new TripManager();
        Scanner sc = new Scanner(System.in);

        mgr.addTrip(new InnerCityBus("CX001", "Nguyen A", "51A-12345", 12, 30.5, 1500000));
        mgr.addTrip(new InnerCityBus("CX002", "Tran B", "51B-67890", 15, 22.0, 1200000));
        mgr.addTrip(new OuterCityBus("CX101", "Le C", "51C-11111", "Vung Tau", 2, 3000000));
        mgr.addTrip(new OuterCityBus("CX102", "Pham D", "51D-22222", "Da Lat", 3, 4500000));

        int choice;
        do {
            System.out.println("\n--- MENU QUẢN LÝ CHUYẾN XE ---");
            System.out.println("1. Thêm chuyến xe");
            System.out.println("2. Hiển thị tất cả chuyến xe");
            System.out.println("3. Tổng doanh thu Xe nội thành");
            System.out.println("4. Tổng doanh thu Xe ngoại thành");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Loại (1-Nội thành,2-Ngoại thành): ");
                    int t = sc.nextInt(); sc.nextLine();
                    System.out.print("Mã chuyến: ");
                    String id = sc.nextLine();
                    System.out.print("Tài xế: ");
                    String name = sc.nextLine();
                    System.out.print("Biển số: ");
                    String plate = sc.nextLine();
                    if (t == 1) {
                        System.out.print("Số tuyến: ");
                        int route = sc.nextInt();
                        System.out.print("Km đi được: ");
                        double km = sc.nextDouble();
                        System.out.print("Doanh thu: ");
                        double rev = sc.nextDouble();
                        mgr.addTrip(new InnerCityBus(id, name, plate, route, km, rev));
                    } else {
                        System.out.print("Nơi đến: ");
                        String dest = sc.nextLine();
                        System.out.print("Số ngày đi: ");
                        int days = sc.nextInt();
                        System.out.print("Doanh thu: ");
                        double rev2 = sc.nextDouble();
                        mgr.addTrip(new OuterCityBus(id, name, plate, dest, days, rev2));
                    }
                    break;
                case 2:
                    mgr.displayAll();
                    break;
                case 3:
                    System.out.printf("Tổng doanh thu Nội thành: %, .0f%n",
                        mgr.totalRevenueByType("Nội thành"));
                    break;
                case 4:
                    System.out.printf("Tổng doanh thu Ngoại thành: %, .0f%n",
                        mgr.totalRevenueByType("Ngoại thành"));
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
