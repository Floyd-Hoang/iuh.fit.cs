/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 11:53:19 AM
 */

package chuong2.bai4;

/**
 * 
 */
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.maHang = kiemTraMaHang(maHang) ? maHang : "DEFAULT";
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public HangThucPham(String maHang) {
        this.maHang = kiemTraMaHang(maHang) ? maHang : "DEFAULT";
        this.tenHang = "Chưa xác định";
        this.donGia = 0;
        this.ngaySanXuat = new Date();
        this.ngayHetHan = new Date();
    }

    private boolean kiemTraMaHang(String maHang) {
        return maHang != null && !maHang.trim().isEmpty();
    }

    private boolean kiemTraTenHang(String tenHang) {
        return tenHang != null && !tenHang.trim().isEmpty();
    }

    private boolean kiemTraDonGia(double donGia) {
        return donGia > 0;
    }

    private boolean kiemTraNgay(Date ngay) {
        return ngay != null;
    }

    private boolean kiemTraNgayHetHan(Date ngaySanXuat, Date ngayHetHan) {
        return ngayHetHan.after(ngaySanXuat);
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = kiemTraTenHang(tenHang) ? tenHang : "Chưa xác định";
    }

    public void setDonGia(double donGia) {
        this.donGia = kiemTraDonGia(donGia) ? donGia : 0;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = kiemTraNgay(ngaySanXuat) ? ngaySanXuat : new Date();
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (kiemTraNgay(ngayHetHan) && kiemTraNgayHetHan(this.ngaySanXuat, ngayHetHan)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            long oneDay = 24 * 60 * 60 * 1000;
            this.ngayHetHan = new Date(this.ngaySanXuat.getTime() + oneDay);
        }
    }

    public boolean daHetHan() {
        Date ngayHienTai = new Date();
        return ngayHienTai.after(this.ngayHetHan);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        
        String trangThai = daHetHan() ? "ĐÃ HẾT HẠN" : "CÒN HẠN";
        
        return String.format("Mã hàng: %s\nTên hàng: %s\nĐơn giá: %s VND\nNgày sản xuất: %s\nNgày hết hạn: %s\nTrạng thái: %s",
                maHang, tenHang, decimalFormat.format(donGia), 
                dateFormat.format(ngaySanXuat), dateFormat.format(ngayHetHan), trangThai);
    }
}