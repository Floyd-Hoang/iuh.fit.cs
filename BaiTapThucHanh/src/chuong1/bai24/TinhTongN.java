/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:34:41 PM
 */

package chuong1.bai24;

/**
 * 
 */
import java.util.Scanner;

public class TinhTongN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;
        
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        
        System.out.println("Tổng N số nguyên: " + tong);
    }
}