package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class PhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int hang = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cot = scanner.nextInt();
        double[][] arr = new double[hang][cot];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        double max = arr[0][0];
        int maxHang = 0;
        int maxCot = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxHang = i;
                    maxCot = j;
                }
            }
        }
        System.out.println("\nPhần tử lớn nhất trong mảng là: " + max);
        System.out.println("vị trí: hàng " + maxHang + ", cột " + maxCot);

        scanner.close();
    }
}
