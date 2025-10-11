/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 6:24:00 PM
 */

package chuong4.bai1;

/**
 * 
 */
public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;
    
    public HoaDonTheoNgay(String maHoaDon, String ngayHoaDon, String tenKhachHang,
                          String maPhong, double donGia, int soNgayThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }
    
    @Override
    public double tinhThanhTien() {
        double thanhTien = soNgayThue * donGia;
        if (soNgayThue > 7) {
            thanhTien *= 0.8;
        }
        return thanhTien;
    }
    
    public int getSoNgayThue() { 
        return soNgayThue; 
    }
    
    public void setSoNgayThue(int soNgayThue) { 
        this.soNgayThue = soNgayThue; 
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Số ngày thuê: %d, Thành tiền: %.2f", 
                                              soNgayThue, tinhThanhTien());
    }
}
