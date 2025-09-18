/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 18-Sep-2025 11:50:09 PM
 */

package chuong1.bai27;

/**
 * 
 */
import java.util.Scanner;

public class ChuoiFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int a = 1, b = 1;
        
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }
        
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

