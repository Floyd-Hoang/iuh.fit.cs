/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 11:18:44 PM
 */

package chuong2.bai1;
import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }

    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public String toString() {
        return "Chiều dài = " + chieuDai +
               ", Chiều rộng = " + chieuRong +
               ", Diện tích = " + dienTich() +
               ", Chu vi = " + chuVi();
    }
}

