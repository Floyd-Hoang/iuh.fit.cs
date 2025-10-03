/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 11:28:20 PM
 */

package chuong2.bai2;

public class SinhVien {
    private int masv;
    private String hoten;
    private float diemlt;
    private float diemth;

    public SinhVien() {
        this(0, "", 0.0f, 0.0f);
    }

    public SinhVien(int masv, String hoten, float diemlt, float diemth) {
        this.masv = masv;
        this.hoten = hoten;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }

    public int getMasv() { return masv; }
    public void setMasv(int masv) { this.masv = masv; }

    public String getHoten() { return hoten; }
    public void setHoten(String hoten) { this.hoten = hoten; }

    public float getDiemlt() { return diemlt; }
    public void setDiemlt(float diemlt) { this.diemlt = diemlt; }

    public float getDiemth() { return diemth; }
    public void setDiemth(float diemth) { this.diemth = diemth; }

    public float getDiemtb() {
        return (diemlt + diemth) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %8.2f %8.2f %8.2f",
                             masv, hoten, diemlt, diemth, getDiemtb());
    }
}
