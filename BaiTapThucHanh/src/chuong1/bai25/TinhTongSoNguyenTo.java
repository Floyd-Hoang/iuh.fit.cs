/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:38:43 PM
 */

package chuong1.bai25;

/**
 * 
 */
import java.util.Scanner;

public class TinhTongSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tong = 0;

        for (int i = 2; i < n; i++) {
            boolean laSoNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
                tong += i;
            }
        }

        System.out.println("Tổng các số nguyên tố nhỏ hơn N: " + tong);
    }
}
