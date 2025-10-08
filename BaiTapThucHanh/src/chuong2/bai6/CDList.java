/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 08-Oct-2025 3:05:40 PM
 */

package chuong2.bai6;

/**
 * 
 */
import java.util.Arrays;
import java.util.Comparator;

public class CDList {
    private CD[] cds;
    private int count;

    public CDList() {
        cds = new CD[10];
        count = 0;
    }

    public CDList(int size) {
        if (size > 0) {
            cds = new CD[size];
        } else {
            cds = new CD[10];
        }
        count = 0;
    }

    public boolean themCD(CD cd) {
        if (count == cds.length) return false;
        for (int i = 0; i < count; i++) {
            if (cds[i].getMaCD() == cd.getMaCD()) {
                return false;
            }
        }
        cds[count++] = cd;
        return true;
    }

    public int soLuongCD() {
        return count;
    }

    public double tongGiaThanh() {
        double tong = 0;
        for (int i = 0; i < count; i++) {
            tong += cds[i].getGiaThanh();
        }
        return tong;
    }

    public void sapXepTheoGiaThanhGiamDan() {
        Arrays.sort(cds, 0, count, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return Double.compare(o2.getGiaThanh(), o1.getGiaThanh());
            }
        });
    }

    public void sapXepTheoTuaCDTangDan() {
        Arrays.sort(cds, 0, count, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD());
            }
        });
    }

    public void inDanhSach() {
        System.out.println("MaCD\tTuaCD\tSoBaiHat\tGiaThanh");
        for (int i = 0; i < count; i++) {
            System.out.println(cds[i].toString());
        }
    }
}

