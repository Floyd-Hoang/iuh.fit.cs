/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 1:45:15 AM
 */

package chuong3.bai6;

/**
 * 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BookManager mgr = new BookManager();
        Scanner sc = new Scanner(System.in);

        // Dữ liệu mẫu
        mgr.addBook(new Textbook("GK01", "10/2025", 50000, 10, "NXB Giáo Dục", "moi"));
        mgr.addBook(new Textbook("GK02", "09/2024", 40000, 5, "NXB X", "cu"));
        mgr.addBook(new ReferenceBook("TK01", "08/2023", 120000, 3, "NXB X", 15000));
        mgr.addBook(new ReferenceBook("TK02", "08/2024", 90000, 2, "NXB Văn Hóa", 20000));

        int ch;
        do {
            System.out.println("\n--- MENU QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị tất cả sách");
            System.out.println("3. Tổng thành tiền sách giáo khoa");
            System.out.println("4. Tổng thành tiền sách tham khảo");
            System.out.println("5. Trung bình đơn giá sách tham khảo");
            System.out.println("6. Xuất sách giáo khoa của NXB bất kỳ");
            System.out.println("0. Thoát");
            System.out.print("Chọn: "); ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Loại (1-GK,2-TK): "); int type = sc.nextInt(); sc.nextLine();
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Ngày nhập: "); String date = sc.nextLine();
                    System.out.print("Đơn giá: "); double price = sc.nextDouble();
                    System.out.print("Số lượng: "); int qty = sc.nextInt(); sc.nextLine();
                    System.out.print("NXB: "); String nxb = sc.nextLine();
                    if(type == 1) {
                        System.out.print("Tình trạng (moi/cu): "); String tt = sc.nextLine();
                        mgr.addBook(new Textbook(id,date,price,qty,nxb,tt));
                    } else {
                        System.out.print("Thuế: "); double thue = sc.nextDouble(); sc.nextLine();
                        mgr.addBook(new ReferenceBook(id,date,price,qty,nxb,thue));
                    }
                    break;
                case 2:
                    mgr.displayAll(); break;
                case 3:
                    System.out.printf("Tổng thành tiền sách giáo khoa: %, .0f\n", mgr.totalPriceByType("Giao khoa")); break;
                case 4:
                    System.out.printf("Tổng thành tiền sách tham khảo: %, .0f\n", mgr.totalPriceByType("Tham khao")); break;
                case 5:
                    System.out.printf("Trung bình đơn giá sách TK: %, .0f\n", mgr.avgUnitPriceRef()); break;
                case 6:
                    System.out.print("Nhập tên NXB: "); String px = sc.nextLine();
                    mgr.printTextbooksByPublisher(px); break;
            }
        } while (ch != 0);
        sc.close();
    }
}

