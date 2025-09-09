/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 09-Sep-2025 10:07:10 PM
 */

package chuong1.bai12;

/**
 * 
 */
public class Thesumofallmultiplesof7between1and100 {
	public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }

        System.out.println("Tổng các số là bội số của 7 từ 1 đến 100 là: " + sum);
    }

}
