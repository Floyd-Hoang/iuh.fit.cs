package chuong1.bai13;

public class Thesumfrom1toN {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Vui lòng nhập một số nguyên n từ tham số dòng lệnh.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Tham số không hợp lệ. Vui lòng nhập một số nguyên.");
        }
    }
}
