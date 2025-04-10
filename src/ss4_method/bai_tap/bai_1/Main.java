package ss4_method.bai_tap.bai_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("nhập số c: ");
        double c = scanner.nextDouble();
        PhuongTrinhBacNhat phuongTrinhBacNhat = new PhuongTrinhBacNhat(a, b, c);
        double delTa = phuongTrinhBacNhat.getDelTa();
        if (delTa > 0) {
            System.out.println("nghiệm 1:" + phuongTrinhBacNhat.getNghiem1() + " nghiệm 2: " + phuongTrinhBacNhat.getNghiem2());
        } else if (delTa == 0) {
            System.out.println("pt có một nghiêm là: " + phuongTrinhBacNhat.getNghiem2());
        } else {
            System.out.println("pt vô nghệm");
        }
    }
}
