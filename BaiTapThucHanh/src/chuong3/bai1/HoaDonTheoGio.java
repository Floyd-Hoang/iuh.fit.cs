/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 6:19:43 PM
 */

package chuong3.bai1;

/**
 * 
 */
public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;
    
    public HoaDonTheoGio(String maHoaDon, String ngayHoaDon, String tenKhachHang,
                         String maPhong, double donGia, int soGioThue) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
    }
    
    @Override
    public double tinhThanhTien() {
        if (soGioThue <= 24) {
            return soGioThue * donGia;
        } else {
            return (soGioThue <= 30) ? 24 * donGia : 0;
        }
    }
    
    public int getSoGioThue() { 
        return soGioThue; 
    }
    
    public void setSoGioThue(int soGioThue) { 
        this.soGioThue = soGioThue; 
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", Số giờ thuê: %d, Thành tiền: %.2f", 
                                              soGioThue, tinhThanhTien());
    }
}
