/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 06-Sep-2025 9:54:16 PM
 */

package chuong1.bai9;

/**
 * 
 */
public class Switch {
	    public static void main(String[] args) {
	        int month = 8; // Số đại diện cho tháng
	        String monthString;

	        // Dùng switch để xác định tên tháng tương ứng
	        switch (month) {
	            case 1:  monthString = "January"; break;
	            case 2:  monthString = "February"; break;
	            case 3:  monthString = "March"; break;
	            case 4:  monthString = "April"; break;
	            case 5:  monthString = "May"; break;
	            case 6:  monthString = "June"; break;
	            case 7:  monthString = "July"; break;
	            case 8:  monthString = "August"; break;
	            case 9:  monthString = "September"; break;
	            case 10: monthString = "October"; break;
	            case 11: monthString = "November"; break;
	            case 12: monthString = "December"; break;
	            default: monthString = "Invalid month"; break; // Trường hợp không hợp lệ
	        }

	        // In ra tên tháng tương ứng
	        System.out.println(monthString);
	    }

	    // Sử dụng câu lệnh switch-case để ánh xạ số nguyên thành tên các tháng.
	}



