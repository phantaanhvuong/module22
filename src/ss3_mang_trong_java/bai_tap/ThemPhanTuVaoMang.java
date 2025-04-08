package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài mảng: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("nhập lại độ dài mảng: ");
            }

        } while (n < 0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhập phần tử thứ " + i + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử trong mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int x, index;
        System.out.print("nhập số cần chèn: ");
        x = scanner.nextInt();
        System.out.println("nhập vị trí cần thêm");
        index = scanner.nextInt();
        if (index < 0 || index > n) {
            System.out.println("không chèn được phần vào mảng");
        } else {
            int[] newArr = new int[n + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = x;
            for (int i = index; i < n; i++) {
                newArr[i+1] = arr[i];
            }
            System.out.print("mảng sau khi chèn: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
        }

        System.out.println();
    }
}
