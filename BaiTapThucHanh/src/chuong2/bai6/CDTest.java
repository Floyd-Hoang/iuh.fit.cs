/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 3:06:13 PM
 */

package chuong2.bai6;

/**
 * 
 */
import java.util.Scanner;

public class CDTest {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
			CDList ds = new CDList();
			int chon;

			do {
			    System.out.println("1. Them CD");
			    System.out.println("2. So luong CD");
			    System.out.println("3. Tong gia thanh");
			    System.out.println("4. Sap xep danh sach giam dan theo gia thanh");
			    System.out.println("5. Sap xep danh sach tang dan theo tua CD");
			    System.out.println("6. In danh sach CD");
			    System.out.println("7. Thoat");
			    System.out.print("Chon: ");
			    chon = sc.nextInt();
			    sc.nextLine();

			    switch (chon) {
			        case 1:
			            System.out.print("Nhap ma CD (>0): ");
			            int ma = sc.nextInt();
			            sc.nextLine();
			            System.out.print("Nhap tua CD (chuoi): ");
			            String tua = sc.nextLine();
			            System.out.print("Nhap so bai hat (>0): ");
			            int soBai = sc.nextInt();
			            System.out.print("Nhap gia thanh (>0): ");
			            double gia = sc.nextDouble();
			            sc.nextLine();

			            CD cd = new CD(ma, tua, soBai, gia);
			            if (ds.themCD(cd)) {
			                System.out.println("Them thanh cong.");
			            } else {
			                System.out.println("Them that bai. Ma CD da ton tai hoac danh sach day.");
			            }
			            break;
			        case 2:
			            System.out.println("So luong CD: " + ds.soLuongCD());
			            break;
			        case 3:
			            System.out.println("Tong gia thanh: " + ds.tongGiaThanh());
			            break;
			        case 4:
			            ds.sapXepTheoGiaThanhGiamDan();
			            System.out.println("Danh sach da sap xep giam dan theo gia thanh.");
			            break;
			        case 5:
			            ds.sapXepTheoTuaCDTangDan();
			            System.out.println("Danh sach da sap xep tang dan theo tua CD.");
			            break;
			        case 6:
			            ds.inDanhSach();
			            break;
			        case 7:
			            System.out.println("Ket thuc chuong trinh.");
			            break;
			        default:
			            System.out.println("Lua chon khong hop le.");
			            break;
			    }
			} while (chon != 7);
		}
    }
}
