/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:23:40 PM
 */

package chuong1.bai22;

/**
 * 
 */
import java.util.Scanner;

public class KiemTraSoNguyenTo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean laSoNguyenTo = true;

        if (n < 2) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }

        if (laSoNguyenTo) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("Khong phai la so nguyen to");
        }
    }

}
