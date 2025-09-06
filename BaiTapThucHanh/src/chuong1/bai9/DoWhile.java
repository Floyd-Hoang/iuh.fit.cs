/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 06-Sep-2025 9:56:11 PM
 */

package chuong1.bai9;

/**
 * 
 */
public class DoWhile {
	    public static void main(String[] args) {
	        int count = 1; // Biến đếm bắt đầu từ 1

	        // Luôn thực hiện ít nhất 1 lần, sau đó kiểm tra điều kiện
	        do {
	            System.out.println("Count is: " + count);
	            count++; // Tăng biến đếm
	        } while (count < 11); // Tiếp tục nếu count < 11
	    }

	    // Vòng lặp do-while luôn chạy ít nhất một lần trước khi kiểm tra điều kiện.
	}


