/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 15-Sep-2025 5:30:15 PM
 */

package chuong1.bai17;

/**
 * 
 */
public class KiemTraSoChanLe {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Số vừa nhập là zero.");
        } else if (number % 2 == 0) {
            System.out.println("Số vừa nhập là số chẵn.");
        } else {
            System.out.println("Số vừa nhập là số lẻ.");
        }

        scanner.close();
    }

}
