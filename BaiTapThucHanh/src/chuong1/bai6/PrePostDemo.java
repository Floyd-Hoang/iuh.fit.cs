/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 04-Sep-2025 5:54:38 PM
 */

package chuong1.bai6;

/**
 * 
 */
public class PrePostDemo {
	public static void main(String[] args) {
        int i = 3;
        i++;                 // i = 4
        System.out.println(i);
        
        ++i;                 // i = 5
        System.out.println(i);
        
        System.out.println(++i); // tăng i trước, in 6
        
        System.out.println(i++); // in i (6), rồi tăng i (7)
        
        System.out.println(--i); // giảm i trước, in 6
        
        System.out.println(i--); // in i (6), rồi giảm i (5)
        
        System.out.println(i);   // in i = 5
    }
}
// Pre-increment (++i): tăng rồi dùng
// Post-increment (i++): dùng rồi tăng
// Pre-decrement (--i), Post-decrement (i--) tương tự
// Ví dụ: nếu i = 5, ++i = 6, i++ vẫn in 5 rồi mới tăng lên 6
