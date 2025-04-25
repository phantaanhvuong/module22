package mvc_arraylist.view;

import mvc_arraylist.entity.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoView {

    private static final Scanner scanner = new Scanner(System.in);
    public static  void  displayOto(List<Oto> otos){
        for (int i = 0; i < otos.size(); i++) {
            System.out.println(otos.get(i));
        }
    }
    public static Oto themMoiOto() {
        System.out.println("nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhập hãng sản xuất");
        String hangSx = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        int namSx = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chủ sỡ hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhập số chổ ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu xe");
        String kieuXe = scanner.nextLine();
        return new Oto(bienKiemSoat,hangSx,namSx,chuSoHuu,kieuXe,soChoNgoi);
    }
}
