/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 11:19:12 PM
 */

package chuong2.bai1;

import java.util.Scanner;

/**
 * 
 */
public class TestHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(dai, rong);

        System.out.println("\nKết quả:");
        System.out.println(hcn.toString());

        sc.close();
    }
}