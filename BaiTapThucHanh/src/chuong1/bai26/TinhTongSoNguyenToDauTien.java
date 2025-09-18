/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:44:38 PM
 */

package chuong1.bai26;

/**
 * 
 */
import java.util.Scanner;

public class TinhTongSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0, tong = 0, num = 2;

        while (count < n) {
            boolean laSoNguyenTo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
                tong += num;
                count++;
            }
            num++;
        }

        System.out.println("Tổng N số nguyên tố đầu tiên: " + tong);
    }
}

