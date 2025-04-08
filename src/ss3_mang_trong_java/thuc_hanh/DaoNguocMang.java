package ss3_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng :");
            n = scanner.nextInt();
            if (n > 20) {
                System.out.println(" nhập lại độ dài mảng bé hơn 20");
            }
        } while (n > 20);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ" + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.printf("các phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[n - 1 - j];
            array[n - 1 - j] = temp;
        }
        System.out.printf( "\n"+"Đảo ngược mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
