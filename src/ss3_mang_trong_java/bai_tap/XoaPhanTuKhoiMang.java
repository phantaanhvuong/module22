package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng :");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println(" nhập lại độ dài mảng ");
            }
        } while (n < 0);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ" + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.print("các phần tử trong mảng: ");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("nhập phần tử cần xoá");
        int x;
        x = scanner.nextInt();
        int test = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                test = array[i];
                break;
            }
        }
        if (test == -1) {
            System.out.println("phần tử" + x + " không tồn tại trong mảng");
        } else {
            for (int i = test; i < n; i++) {
                array[i] = array[i + 1];
            }
            n--;
            System.out.print("mảng sao khi xoá: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }
    }

}
