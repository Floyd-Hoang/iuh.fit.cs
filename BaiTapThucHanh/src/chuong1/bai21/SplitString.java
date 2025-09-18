/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:08:21 PM
 */

package chuong1.bai21;

/**
 * 
 */
import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }

}
