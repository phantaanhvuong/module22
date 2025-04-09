package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số hàng: ");
        int hang = scanner.nextInt();
        System.out.print("nhâph số cột: ");
        int cot = scanner.nextInt();
        int[][] arr = new int[hang][cot];
        System.out.println("nhập các phần tử của mảng: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("arr[" + i + "][" + j + "]=");
                arr[i][j] = scanner.nextInt();
                ;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("nhập cột cần tính tổng");
        int sum = 0;
        int cotTinhToan = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == cotTinhToan - 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng của cột" + cotTinhToan + "là" + sum);
    }

}
