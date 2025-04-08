package ss3_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhat {
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
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ" + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.print("các phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max + ", ở vị trí thứ " + index);
    }
}
