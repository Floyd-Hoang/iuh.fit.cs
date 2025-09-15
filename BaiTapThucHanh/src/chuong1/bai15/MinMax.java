/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 15-Sep-2025 4:48:37 PM
 */

package chuong1.bai15;

/**
 * 
 */
public class MinMax {
	public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập vào ít nhất một số qua dòng lệnh.");
            return;
        }

        try {
            int min = Integer.parseInt(args[0]);
            int max = min;

            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Giá trị nhỏ nhất: " + min);
            System.out.println("Giá trị lớn nhất: " + max);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng chỉ nhập các số nguyên hợp lệ.");
        }
    }
}


