/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 6:24:18 PM
 */

package chuong3.bai1;

/**
 * 
 */
import java.util.*;

public class QuanLyHoaDon {
    private ArrayList<HoaDon> danhSachHoaDon;
    
    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }
    
    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }
    
    public void xuatDanhSach() {
        System.out.println("\n=== DANH SÁCH HÓA ĐƠN ===");
        for (int i = 0; i < danhSachHoaDon.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachHoaDon.get(i));
        }
    }
    
    public void thongKeSoLuong() {
        int soLuongTheoGio = 0;
        int soLuongTheoNgay = 0;
        
        for (HoaDon hd : danhSachHoaDon) {
            if (hd instanceof HoaDonTheoGio) {
                soLuongTheoGio++;
            } else if (hd instanceof HoaDonTheoNgay) {
                soLuongTheoNgay++;
            }
        }
        
        System.out.println("\n=== THỐNG KÊ SỐ LƯỢNG ===");
        System.out.println("Hóa đơn theo giờ: " + soLuongTheoGio);
        System.out.println("Hóa đơn theo ngày: " + soLuongTheoNgay);
        System.out.println("Tổng số hóa đơn: " + danhSachHoaDon.size());
    }
    
    public void tinhTrungBinhThang9Nam2013() {
        double tongThanhTien = 0;
        int soLuongHoaDon = 0;
        
        for (HoaDon hd : danhSachHoaDon) {
            if (hd.getNgayHoaDon().contains("9/2013") || 
                hd.getNgayHoaDon().contains("09/2013")) {
                tongThanhTien += hd.tinhThanhTien();
                soLuongHoaDon++;
            }
        }
        
        System.out.println("\n=== TRUNG BÌNH THÀNH TIỀN THÁNG 9/2013 ===");
        if (soLuongHoaDon > 0) {
            double trungBinh = tongThanhTien / soLuongHoaDon;
            System.out.printf("Số hóa đơn tháng 9/2013: %d\n", soLuongHoaDon);
            System.out.printf("Tổng thành tiền: %.2f\n", tongThanhTien);
            System.out.printf("Trung bình thành tiền: %.2f\n", trungBinh);
        } else {
            System.out.println("Không có hóa đơn nào trong tháng 9/2013");
        }
    }
    
    public void nhapDuLieu() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số lượng hóa đơn: ");
			int n = scanner.nextInt();
			scanner.nextLine();
			
			for (int i = 0; i < n; i++) {
			    System.out.println("\n--- Nhập hóa đơn thứ " + (i + 1) + " ---");
			    
			    System.out.print("Mã hóa đơn: ");
			    String maHoaDon = scanner.nextLine();
			    
			    System.out.print("Ngày hóa đơn (dd/mm/yyyy): ");
			    String ngayHoaDon = scanner.nextLine();
			    
			    System.out.print("Tên khách hàng: ");
			    String tenKhachHang = scanner.nextLine();
			    
			    System.out.print("Mã phòng: ");
			    String maPhong = scanner.nextLine();
			    
			    System.out.print("Đơn giá: ");
			    double donGia = scanner.nextDouble();
			    
			    System.out.print("Loại hóa đơn (1-Theo giờ, 2-Theo ngày): ");
			    int loai = scanner.nextInt();
			    scanner.nextLine();
			    
			    if (loai == 1) {
			        System.out.print("Số giờ thuê: ");
			        int soGioThue = scanner.nextInt();
			        scanner.nextLine();
			        
			        HoaDonTheoGio hd = new HoaDonTheoGio(maHoaDon, ngayHoaDon, 
			                                             tenKhachHang, maPhong, donGia, soGioThue);
			        themHoaDon(hd);
			        
			    } else if (loai == 2) {
			        System.out.print("Số ngày thuê: ");
			        int soNgayThue = scanner.nextInt();
			        scanner.nextLine();
			        
			        HoaDonTheoNgay hd = new HoaDonTheoNgay(maHoaDon, ngayHoaDon, 
			                                               tenKhachHang, maPhong, donGia, soNgayThue);
			        themHoaDon(hd);
			    }
			}
		}
    }
}

