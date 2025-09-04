/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 04-Sep-2025 5:54:05 PM
 */

package chuong1.bai6;

/**
 * 
 */
public class UnaryDemo {
	public static void main(String[] args) {
        int a = +5;       // dấu + đơn (không đổi gì)
        System.out.println(a);  // 5
        
        a--;              // giảm a 1 đơn vị => 4
        System.out.println(a);
        
        a++;              // tăng a 1 đơn vị => 5
        System.out.println(a);
        
        a = -a;           // đổi dấu a => -5
        System.out.println(a);
        
        boolean flag = false;
        System.out.println(flag);   // false
        System.out.println(!flag);  // phủ định, ra true
    }
}
// Toán tử một ngôi: + (dấu cộng), - (đổi dấu), ++, --, ! (phủ định logic)
// Ví dụ: !false = true
