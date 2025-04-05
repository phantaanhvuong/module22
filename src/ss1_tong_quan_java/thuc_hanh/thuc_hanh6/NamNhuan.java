package ss1_tong_quan_java.thuc_hanh.thuc_hanh6;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        do {
            System.out.println("nhập năm muốn kiểm tra");
            year = Integer.parseInt(scanner.nextLine());
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " là năm nhuận");
                    } else {
                        System.out.println(year + " không phải năm nhuận");
                    }
                } else {
                    System.out.println(year + " là năm nhuận");
                }
            }else {
                System.out.println(year + "không phải năm nhuận");
            }
        }while (year>0);
    }
}
