/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 04-Sep-2025 6:06:29 PM
 */

package chuong1.bai7;

/**
 * 
 */
class ComparisonDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        System.out.println("value1 == value2: " + (value1 == value2));  // So sánh bằng
        System.out.println("value1 != value2: " + (value1 != value2));  // Khác nhau
        System.out.println("value1 > value2: " + (value1 > value2));    // Lớn hơn
        System.out.println("value1 < value2: " + (value1 < value2));    // Nhỏ hơn
        System.out.println("value1 <= value2: " + (value1 <= value2));  // Nhỏ hơn hoặc bằng

        System.out.println("(value1 <= value2) && (value1 == value2): " 
            + ((value1 <= value2) && (value1 == value2))); // AND: đúng nếu cả hai đúng
        System.out.println("(value1 <= value2) || (value1 == value2): " 
            + ((value1 <= value2) || (value1 == value2))); // OR: đúng nếu ít nhất một đúng
    }
}
// Toán tử so sánh: ==, !=, >, <, <=
// Toán tử logic: && (và), || (hoặc)
// Ví dụ:
// 1 == 2 là false vì 1 khác 2
// 1 != 2 là true vì 1 khác 2
// true && false = false vì cả hai phải đúng
// true || false = true vì chỉ cần một đúng
