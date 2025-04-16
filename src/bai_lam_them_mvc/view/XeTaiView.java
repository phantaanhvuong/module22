package bai_lam_them_mvc.view;

import bai_lam_them_mvc.entity.XeTai;

import java.util.Scanner;

public class XeTaiView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayXeTai(XeTai[] xeTais){
        for (int i = 0; i < xeTais.length; i++) {
            if (xeTais[i] != null){
                System.out.println(xeTais[i]);
            }else {
                break;
            }
        }
    }
    public static XeTai themMoiXeTai(){
        System.out.println("nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String hangSx = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        int namSx = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhập tải trọng");
        int taiTrong = Integer.parseInt(scanner.nextLine());
        return new XeTai(bienKiemSoat,hangSx, namSx, chuSoHuu, taiTrong);
    }
}
