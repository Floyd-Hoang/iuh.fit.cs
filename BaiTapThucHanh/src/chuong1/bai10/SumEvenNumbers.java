/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 06-Sep-2025 10:41:22 PM
 */

package chuong1.bai10;

/**
 * 
 */
public class SumEvenNumbers {
	public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 2;

        while (count < 10) {
            sum += number;
            number += 2;
            count++;
        }

        System.out.println("Tổng 10 số chẵn đầu tiên là: " + sum);
    }


}
