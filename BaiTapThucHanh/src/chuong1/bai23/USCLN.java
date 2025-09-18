/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:30:32 PM
 */

package chuong1.bai23;

/**
 * 
 */
import java.util.Scanner;

public class USCLN {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        
        System.out.println("USCLN: " + a);
    }

}
