/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 1:14:55 PM
 */

package chuong2.bai5;

/**
 * 
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long sotk;
    private String tentk;
    private double sotien;
    private String trangthai;
    private static final double LAISUAT = 0.035;

    public Account() {
        this.sotk = 999999;
        this.tentk = "chua xac dinh";
        this.sotien = 50;
        this.trangthai = "";
    }

    public Account(long sotk, String tentk, double sotien) {
        if (sotk > 0 && sotk != 999999) {
            this.sotk = sotk;
        } else {
            this.sotk = 999999;
        }
        if (!tentk.equals("")) {
            this.tentk = tentk;
        } else {
            this.tentk = "chua xac dinh";
        }
        if (sotien >= 50) {
            this.sotien = sotien;
        } else {
            this.sotien = 50;
        }
        this.trangthai = "";
    }

    public long getSotk() {
        return sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public double getSotien() {
        return sotien;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void napTien(double tien) {
        if (tien > 0) {
            this.sotien += tien;
        }
    }

    public boolean rutTien(double tien) {
        if (tien > 0 && tien <= this.sotien) {
            this.sotien -= tien;
            return true;
        }
        return false;
    }

    public boolean chuyenTien(Account acc, double tien) {
        if (tien > 0 && tien <= this.sotien) {
            this.rutTien(tien);
            acc.napTien(tien);
            return true;
        }
        return false;
    }

    public double daoHan() {
        double laisuat = this.sotien * LAISUAT;
        this.sotien += laisuat;
        return this.sotien;
    }

    public String toString() {
        @SuppressWarnings("deprecation")
		Locale locale = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return this.sotk + "\t" + this.tentk + "\t" + formatter.format(this.sotien);
    }
}
