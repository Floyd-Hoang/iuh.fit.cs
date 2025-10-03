/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 11:29:05 PM
 */

package chuong2.bai2;

/**
 * 
 */
import java.util.Scanner;

public class SinhVienTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin sinh viên sv1:");
        System.out.print("Mã SV: ");
        int masv1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Họ tên: ");
        String hoten1 = sc.nextLine();
        System.out.print("Điểm LT: ");
        float diemlt1 = sc.nextFloat();
        System.out.print("Điểm TH: ");
        float diemth1 = sc.nextFloat();
        SinhVien sv1 = new SinhVien(masv1, hoten1, diemlt1, diemth1);

        SinhVien sv2 = new SinhVien(22222, "Nguyen Van B", 7.5f, 8.0f);

        SinhVien sv3 = new SinhVien();
        System.out.println("\nNhập thông tin sinh viên sv3:");
        System.out.print("Mã SV: ");
        sv3.setMasv(sc.nextInt());
        sc.nextLine();
        System.out.print("Họ tên: ");
        sv3.setHoten(sc.nextLine());
        System.out.print("Điểm LT: ");
        sv3.setDiemlt(sc.nextFloat());
        System.out.print("Điểm TH: ");
        sv3.setDiemth(sc.nextFloat());

        System.out.println("\nDanh sách sinh viên:");
        System.out.printf("%-10s %-20s %8s %8s %8s\n",
                          "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
        System.out.println("-------------------------------------------------------------");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
    }
}
