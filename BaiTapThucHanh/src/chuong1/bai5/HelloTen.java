/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 04-Sep-2025 5:34:53 PM
 */

package chuong1.bai5;

import java.util.Scanner;

public class HelloTen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập tên của bạn: ");
			String name = sc.nextLine();
			System.out.println("Hello " + name );
		}
    }
}
