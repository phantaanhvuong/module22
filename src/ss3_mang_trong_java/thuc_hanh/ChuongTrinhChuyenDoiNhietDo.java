package ss3_mang_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int chon;

        do {
            System.out.println("Menu");
            System.out.println("1. độ F sang độ C");
            System.out.println("2. độ C sang độ F");
            System.out.println("3. Exit");
            System.out.println("chọn số");
            chon = input.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("nhập độ F");
                    doF = input.nextDouble();
                    System.out.println("độ F sang độ C: " + doFSangdoC(doF));
                    break;
                case 2:
                    System.out.println("nhập độ C");
                    doC = input.nextDouble();
                    System.out.println("độ C sang độ F: " + doCSangDoF(doC));
                    break;
                case 3:
                    System.exit(3);
            }
        } while (chon != 0);
    }

    public static double doCSangDoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double doFSangdoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
