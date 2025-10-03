/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 03-Oct-2025 8:40:34 PM
 */

package chuong1.bai28;

/**
 * 
 */
public class Bai28 {

    public static void hinh1() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                if (j == i - 1) System.out.print(" *");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println("\n");
    }

    public static void hinh2() {
        int n = 9;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void hinh3() {
        int n = 9;
        int i = 0;
        do {
            int j = 0;
            do {
                if ((i == j || i + j == n - 1 || i == n / 2) && j != n / 2)
                    System.out.print("*   ");
                else if (i == n / 2 && j == n / 2)
                    System.out.print("*");
                else
                    System.out.print("    ");
                j++;
            } while (j < n);
            System.out.println();
            i++;
        } while (i < n);
    }

    public static void main(String[] args) {
        hinh1();
        hinh2();
        hinh3();
    }
}

               