package mvc_arraylist.view;

import mvc_arraylist.entity.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayXeTai(ArrayList<XeTai> xeTais){
        for (int i = 0; i < xeTais.size(); i++) {
            System.out.println(xeTais.get(i));
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
