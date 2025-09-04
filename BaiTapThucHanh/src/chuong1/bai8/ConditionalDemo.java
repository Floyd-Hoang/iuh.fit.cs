/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 04-Sep-2025 6:27:26 PM
 */

package chuong1.bai8;

/**
 * 
 */
class ConditionalDemo {
    public static void main(String[] args) {
        int value1 = 1; 
        int value2 = 2; 
        int result;
        boolean someCondition = true;

        // Toán tử điều kiện ?: (ternary)
        // Nếu someCondition đúng (true) thì result = value1, ngược lại result = value2
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}

// Giải thích:
// Toán tử ?: là toán tử điều kiện, cấu trúc:
// condition ? value_if_true : value_if_false
// Ví dụ: someCondition = true thì result = value1 (1)
// Nếu someCondition = false thì result = value2 (2)
