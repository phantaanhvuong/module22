package ss4_method.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("nhập chiều rộng");
        double rong = scanner.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(dai,rong);
        System.out.println("hình chữ nhật "+ hinhChuNhat.display());
        System.out.println("diện tích hình chữ nhật là: " +hinhChuNhat.getDienTich());
        System.out.println("chu vi hình chữ nhật là: "+hinhChuNhat.getChuVi());
    }
}
