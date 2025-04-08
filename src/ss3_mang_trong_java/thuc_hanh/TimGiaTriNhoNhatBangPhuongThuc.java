package ss3_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriNhoNhatBangPhuongThuc {
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
        System.out.println("phần tử nhỏ nhất trong mảng là vị trị thứ"+ minValue(array));
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
