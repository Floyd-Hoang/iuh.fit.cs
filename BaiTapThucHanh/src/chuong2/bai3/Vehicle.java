/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 11:39:16 PM
 */

package chuong2.bai3;

/**
 * 
 */

public class Vehicle {
    private String chuxe;
    private String loaixe;
    private int dungtich;
    private double trigia;

    public Vehicle() {
        this("", "", 0, 0.0);
    }

    public Vehicle(String chuxe, String loaixe, int dungtich, double trigia) {
        this.chuxe = chuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
    }

    public String getChuxe() { return chuxe; }
    public void setChuxe(String chuxe) { this.chuxe = chuxe; }

    public String getLoaixe() { return loaixe; }
    public void setLoaixe(String loaixe) { this.loaixe = loaixe; }

    public int getDungtich() { return dungtich; }
    public void setDungtich(int dungtich) { this.dungtich = dungtich; }

    public double getTrigia() { return trigia; }
    public void setTrigia(double trigia) { this.trigia = trigia; }

    public double tinhThue() {
        if (dungtich < 100) return trigia * 0.01;
        else if (dungtich <= 200) return trigia * 0.03;
        else return trigia * 0.05;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %10d %15.0f %15.0f",
                chuxe, loaixe, dungtich, trigia, tinhThue());
    }
}
