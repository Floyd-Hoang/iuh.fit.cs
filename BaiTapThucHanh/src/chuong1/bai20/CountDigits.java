/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:03:51 PM
 */

package chuong1.bai20;

/**
 * 
 */
import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }

        System.out.println("The number of digits in the string is: " + count);
        scanner.close();
    }

}
