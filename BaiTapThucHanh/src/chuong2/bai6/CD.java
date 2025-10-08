/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 3:05:02 PM
 */

package chuong2.bai6;

/**
 * 
 */
public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
        this.maCD = 999999;
        this.tuaCD = "chua xac dinh";
        this.soBaiHat = 1;
        this.giaThanh = 0.01;
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        if (maCD > 0) {
            this.maCD = maCD;
        } else {
            this.maCD = 999999;
        }
        if (tuaCD != null && !tuaCD.trim().isEmpty()) {
            this.tuaCD = tuaCD;
        } else {
            this.tuaCD = "chua xac dinh";
        }
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            this.soBaiHat = 1;
        }
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        } else {
            this.giaThanh = 0.01;
        }
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        }
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD != null && !tuaCD.trim().isEmpty()) {
            this.tuaCD = tuaCD;
        }
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        }
    }

    @Override
    public String toString() {
        return maCD + "\t" + tuaCD + "\t" + soBaiHat + "\t" + giaThanh;
    }
}
