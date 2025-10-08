/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 12:13:06 PM
 */

package chuong2.bai4;

/**
 * 
 */
import java.util.Date;

public class TestHangThucPham {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        HangThucPham htp1 = new HangThucPham(
            "TP001", 
            "Sữa tươi", 
            25000, 
            new Date(124, 0, 15),
            new Date(124, 3, 15)
        );
        
        System.out.println("=== Thông tin hàng thực phẩm 1 ===");
        System.out.println(htp1);
        System.out.println();
        
        HangThucPham htp2 = new HangThucPham("TP002");
        htp2.setTenHang("Bánh mì");
        htp2.setDonGia(15000);
        htp2.setNgaySanXuat(new Date(124, 1, 1));
        htp2.setNgayHetHan(new Date(124, 1, 5));
        
        System.out.println("=== Thông tin hàng thực phẩm 2 ===");
        System.out.println(htp2);
        System.out.println();
        
        HangThucPham htp3 = new HangThucPham(
            "",
            "",
            -5000,
            null,
            new Date(123, 0, 1)
        );
        
        System.out.println("=== Thông tin hàng thực phẩm 3 (dữ liệu không hợp lệ) ===");
        System.out.println(htp3);
    }
}