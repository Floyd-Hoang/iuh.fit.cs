/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 06-Sep-2025 10:00:41 PM
 */

package chuong1.bai9;

/**
 * 
 */
import java.util.Random;

public class RandomNumberInRange {

	    public static void main(String[] args) {
	        int min = 65;
	        int max = 80;

	        Random r = new Random(); // Tạo đối tượng Random
	        int n = r.nextInt(max - min + 1) + min; // Sinh số nguyên ngẫu nhiên trong [min, max]
	        System.out.println("Random number in range: " + n); // In kết quả
	    }

	    // Chương trình sinh số nguyên ngẫu nhiên trong một khoảng giới hạn (min đến max).
	}



