/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 10:53:10 PM
 */

package chuong1.bai19;

/**
 * 
 */
import java.util.Scanner;

public class CountLetterA {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    int count = 0;

    for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
            count++;
        }
    }

    System.out.println("The letter 'a' appears " + count + " times in the string.");
    scanner.close();
}
}