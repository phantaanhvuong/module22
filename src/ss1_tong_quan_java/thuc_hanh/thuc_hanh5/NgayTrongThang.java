package ss1_tong_quan_java.thuc_hanh.thuc_hanh5;

import java.util.Scanner;

public class NgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng bạn muốn kiểm tra");
        int thang = Integer.parseInt(scanner.nextLine());
        switch (thang) {
            case 2:
                System.out.println("tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
                System.out.println("tháng có 31 ngày");
                break;
            case 3:
                System.out.println("tháng có 31 ngày");
                break;
            case 5:
                System.out.println("tháng có 31 ngày");
                break;
            case 7:
                System.out.println("tháng có 31 ngày");
                break;
            case 8:
                System.out.println("tháng có 31 ngày");
                break;
            case 10:
                System.out.println("tháng có 31 ngày");
                break;
            case 12:
                System.out.println("tháng có 31 ngày");
                break;
            case 4:
                System.out.println("tháng có 30 ngày");
                break;
            case 6:
                System.out.println("tháng có 30 ngày");
                break;
            case 9:
                System.out.println("tháng có 30 ngày");
                break;
            case 11:
                System.out.println("tháng có 30 ngày");
                break;
            default:
                System.out.println("không hợp lệ");
        }
    }
}
