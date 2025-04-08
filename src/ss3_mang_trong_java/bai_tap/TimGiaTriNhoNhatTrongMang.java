package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập kích thước mảng: ");
            size = scanner.nextInt();
            if (size < 0 || size > 20) {
                System.out.println("nhâp lại");
            }
        } while (size < 0 || size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử" + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.print("mảng vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int min = arr[0];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i + 1;
            }
        }
        System.out.println("giá trị nhỏ nhất là " + min + " tại vị trí thứ" + index);
    }
}
