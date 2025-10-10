/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 6:18:36 PM
 */

package chuong3.bai1;

/**
 * 
 */
public abstract class HoaDon {
    protected String maHoaDon;
    protected String ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected double donGia;
    
    public HoaDon(String maHoaDon, String ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }
    
    public abstract double tinhThanhTien();
    
    public String getMaHoaDon() { 
        return maHoaDon; 
    }
    
    public String getNgayHoaDon() { 
        return ngayHoaDon; 
    }
    
    public String getTenKhachHang() { 
        return tenKhachHang; 
    }
    
    public String getMaPhong() { 
        return maPhong; 
    }
    
    public double getDonGia() { 
        return donGia; 
    }
    
    public void setMaHoaDon(String maHoaDon) { 
        this.maHoaDon = maHoaDon; 
    }
    
    public void setNgayHoaDon(String ngayHoaDon) { 
        this.ngayHoaDon = ngayHoaDon; 
    }
    
    public void setTenKhachHang(String tenKhachHang) { 
        this.tenKhachHang = tenKhachHang; 
    }
    
    public void setMaPhong(String maPhong) { 
        this.maPhong = maPhong; 
    }
    
    public void setDonGia(double donGia) { 
        this.donGia = donGia; 
    }
    
    @Override
    public String toString() {
        return String.format("Mã HĐ: %s, Ngày: %s, Khách hàng: %s, Phòng: %s, Đơn giá: %.2f",
                           maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
    }
}
