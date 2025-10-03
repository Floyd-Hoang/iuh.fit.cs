package chuong1.bai29;
import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, N;
        System.out.print("Nhập M (chiều cao chính, ví dụ 7): ");
        M = sc.nextInt();
        System.out.print("Nhập N (độ dài đáy cho hình b, nhập 0 để tự chọn): ");
        N = sc.nextInt();
        if (N <= 0) N = 4 * M + 1;
        if (N % 2 == 0) N++;
        if (N < 2 * M + 1) N = 2 * M + 1;

        System.out.println("\nHình a:");
        hinhA(M);

        System.out.println("\nHình b:");
        hinhB(M, N);

        System.out.println("\nHình d:");
        hinhD(M);

        sc.close();
    }

    public static void hinhA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void hinhB(int M, int N) {
        int smallH = M / 2;
        int GAP = Math.max(4, smallH + 1);
        int baseRow = M + GAP;
        int rows = baseRow + 1;
        char[][] canvas = new char[rows][N];
        for (int r = 0; r < rows; r++) for (int c = 0; c < N; c++) canvas[r][c] = ' ';
        int center = N / 2;

        int start = center - (M - 1);
        for (int i = 0; i < M; i++) {
            int stars = M - i;
            for (int j = 0; j < stars; j++) {
                int col = start + j;
                if (col >= 0 && col < N) canvas[i][col] = '*';
            }
        }

        for (int c = 0; c < N; c++) canvas[baseRow][c] = '*';

        int startRow = baseRow + 1 - GAP;
        for (int r = 0; r < smallH; r++) {
            int row = startRow + r;
            for (int k = 0; k <= r; k++) {
                int leftCol = center - 1 - k;
                int rightCol = center + 1 + k;
                if (row >= 0 && row < rows) {
                    if (leftCol >= 0 && leftCol < N) canvas[row][leftCol] = '*';
                    if (rightCol >= 0 && rightCol < N) canvas[row][rightCol] = '*';
                }
            }
        }

        for (int r = 0; r < rows; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < N; c++) {
                sb.append(canvas[r][c]);
                sb.append(' ');
            }
            System.out.println(rtrim(sb.toString()));
        }
    }

    public static void hinhD(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2 * n - 1; i++) System.out.print("*");
        System.out.println();
    }

    private static String rtrim(String s) {
        int i = s.length() - 1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) i--;
        return s.substring(0, i + 1);
    }
}
