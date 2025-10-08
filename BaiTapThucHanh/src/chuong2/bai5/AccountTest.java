/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 1:22:12 PM
 */

package chuong2.bai5;

/**
 * 
 */
import java.util.Scanner;

public class AccountTest {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountList ds = new AccountList();
        int chon;
        do {
            System.out.println("1. Them tai khoan");
            System.out.println("2. So luong TK hien co");
            System.out.println("3. Thong tin tat ca TK");
            System.out.println("4. Nap tien vao TK");
            System.out.println("5. Rut tien");
            System.out.println("6. Chuyen tien");
            System.out.println("7. Ket thuc");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap so TK: ");
                    long stk = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nhap ten TK: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap so tien: ");
                    double tien = sc.nextDouble();
                    Account acc = new Account(stk, ten, tien);
                    if (ds.them(acc)) {
                        System.out.println("Them thanh cong.");
                    } else {
                        System.out.println("Them that bai. So TK da ton tai hoac danh sach day.");
                    }
                    break;
                case 2:
                    System.out.println("So luong TK: " + ds.soLuongTK());
                    break;
                case 3:
                    ds.inDanhSach();
                    break;
                case 4:
                    System.out.print("Nhap so TK: ");
                    long stkNap = sc.nextLong();
                    Account accNap = ds.timKiemTheoSoTK(stkNap);
                    if (accNap != null) {
                        System.out.print("Nhap so tien nap: ");
                        double tienNap = sc.nextDouble();
                        accNap.napTien(tienNap);
                    } else {
                        System.out.println("Khong tim thay TK.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap so TK: ");
                    long stkRut = sc.nextLong();
                    Account accRut = ds.timKiemTheoSoTK(stkRut);
                    if (accRut != null) {
                        System.out.print("Nhap so tien rut: ");
                        double tienRut = sc.nextDouble();
                        if (!accRut.rutTien(tienRut)) {
                            System.out.println("Rut that bai.");
                        }
                    } else {
                        System.out.println("Khong tim thay TK.");
                    }
                    break;
                case 6:
                    System.out.print("Nhap so TK chuyen di: ");
                    long stkChuyenDi = sc.nextLong();
                    Account accChuyenDi = ds.timKiemTheoSoTK(stkChuyenDi);
                    System.out.print("Nhap so TK nhan: ");
                    long stkNhan = sc.nextLong();
                    Account accNhan = ds.timKiemTheoSoTK(stkNhan);
                    if (accChuyenDi != null && accNhan != null) {
                        System.out.print("Nhap so tien chuyen: ");
                        double tienChuyen = sc.nextDouble();
                        if (!accChuyenDi.chuyenTien(accNhan, tienChuyen)) {
                            System.out.println("Chuyen tien that bai.");
                        }
                    } else {
                        System.out.println("TK khong hop le.");
                    }
                    break;
            }
        } while (chon != 7);
    }
}
