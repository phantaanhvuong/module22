package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        double rate = 25000;
        String menhGia;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập mệnh giá cần đổi");
            menhGia = scanner.nextLine();
            System.out.println("nhập số tiền");
            double money = Double.parseDouble(scanner.nextLine());
            if (menhGia.equals("USD")) {

                double tienMy = money / rate;
                System.out.println(" số tiền USD là: " + tienMy + "$");

            } else if (menhGia.equals("VN")) {
                double tienViet = money * rate;
                System.out.println("số tiền việt là: " + tienViet + "VND");
            }
        } while (!menhGia.equals("USD") && !menhGia.equals("VN"));

    }
}
