/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 06-Sep-2025 9:53:24 PM
 */

package chuong1.bai9;

/**
 * 
 */
public class IfElse {
	    public static void main(String[] args) {
	        int testscore = 76; // Điểm kiểm tra
	        char grade; // Biến lưu kết quả xếp loại

	        // Dùng câu lệnh if-else để phân loại điểm
	        if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        // In kết quả xếp loại
	        System.out.println("Grade = " + grade);
	    }

	    // Chương trình sử dụng cấu trúc if-else để phân loại học sinh dựa trên điểm số.
	}



