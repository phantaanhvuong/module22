package mvc_arraylist.view;

import mvc_arraylist.entity.XeMay;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayXeMay(ArrayList<XeMay> xeMays){
        for (int i = 0; i < xeMays.size(); i++) {
            System.out.println(xeMays.get(i));
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
