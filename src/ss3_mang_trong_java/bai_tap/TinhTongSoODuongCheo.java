package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongSoODuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng: ");
        int hang = scanner.nextInt();
        System.out.println("nhập số cột: ");
        int cot = scanner.nextInt();
        int[][] arr = new int[hang][cot];
        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("nhập phần tử [" + i + "][" + j + "]");
                arr[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j) {
//                    sum += arr[i][j];
//                }
//            }
            sum += arr[i][i];
        }
        System.out.println("tổng các toạ độ trùng nhau là: " + sum);
    }
}
