package bai_lam_them_mvc.view;

import bai_lam_them_mvc.entity.XeMay;

import java.util.Scanner;

public class XeMayView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayXeMay(XeMay[] xeMays){
        for (int i = 0; i < xeMays.length; i++) {
            if (xeMays[i] != null){
                System.out.println(xeMays[i]);
            }else {
                break;
            }
        }
    }
    public static XeMay themMoiXeMay(){
        System.out.println("nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String hangSx = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        int namSx = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhập công suất");
        int congSuat = Integer.parseInt(scanner.nextLine());
        return new XeMay(bienKiemSoat,hangSx,namSx,chuSoHuu,congSuat);
    }
}
