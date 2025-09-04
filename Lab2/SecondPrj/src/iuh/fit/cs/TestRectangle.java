package iuh.fit.cs;

import java.util.Scanner;

/**
 * @description: Lớp chạy thử cho Rectangle: nhập chiều dài/chiều rộng, in chu vi, diện tích và biểu diễn.
 * @author: Hoàng Tiến Phát
 * @version: 1.0
 * @created: 30-Aug-2025 12:05:02 PM
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap length: ");
        double length = sc.nextDouble();
        System.out.print("Nhap width: ");
        double width = sc.nextDouble();
        try {
            Rectangle r = new Rectangle(length, width);
            System.out.println("Chu vi: " + r.getPerimeter());
            System.out.println("Dien tich: " + r.getArea());
            System.out.println(r.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
