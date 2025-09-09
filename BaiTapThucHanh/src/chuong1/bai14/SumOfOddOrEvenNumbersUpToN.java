/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 09-Sep-2025 10:35:25 PM
 */

package chuong1.bai14;

/**
 * 
 */
public class SumOfOddOrEvenNumbersUpToN {
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Vui lòng nhập một số nguyên n từ tham số dòng lệnh.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            int sum = 0;

            if (n % 2 == 0) {
                for (int i = 1; i <= n; i += 2) {
                    sum += i;
                }
                System.out.println("Tổng các số lẻ từ 1 đến " + n + " là: " + sum);
            } else {
                for (int i = 2; i <= n; i += 2) {
                    sum += i;
                }
                System.out.println("Tổng các số chẵn từ 2 đến " + n + " là: " + sum);
            }

        } catch (NumberFormatException e) {
            System.out.println("Tham số không hợp lệ. Vui lòng nhập một số nguyên.");
        }
    }

}
