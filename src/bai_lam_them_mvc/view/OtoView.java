package bai_lam_them_mvc.view;

import bai_lam_them_mvc.entity.Oto;
import bai_lam_them_mvc.repository.OtoRepository;
import ss5_access_modifier_static_method_static_property.bai_tap.quan_ly_san_pham.Product;

import java.util.Scanner;

public class OtoView {

    private static Scanner scanner = new Scanner(System.in);
    public static  void  displayOto(Oto[] otos){
        for (int i = 0; i < otos.length; i++) {
            if (otos[i] != null){
                System.out.println(otos[i]);
            }else {
                break;
            }
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
        return new Oto(bienKiemSoat,hangSx,namSx,chuSoHuu,soChoNgoi,kieuXe);
    }
}
