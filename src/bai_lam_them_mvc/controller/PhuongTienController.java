package bai_lam_them_mvc.controller;

import bai_lam_them_mvc.entity.Oto;
import bai_lam_them_mvc.entity.PhuongTien;
import bai_lam_them_mvc.entity.XeMay;
import bai_lam_them_mvc.entity.XeTai;
import bai_lam_them_mvc.repository.IPhuongTienRepository;
import bai_lam_them_mvc.service.*;
import bai_lam_them_mvc.view.OtoView;
import bai_lam_them_mvc.view.XeMayView;
import bai_lam_them_mvc.view.XeTaiView;

import java.util.Scanner;

public class PhuongTienController {

    public static void menuChinh() {
        IPhuongTienService phuongTienService = new PhuongTienService();
        boolean falg = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "\n Chọn chức năng:" +
                    "\n 1. thêm mới phương tiện" +
                    "\n 2. hiển thị phương tiện" +
                    "\n 3. xoá phương tiện" +
                    "\n 4. thoát"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    MenuCon.themMoi();
                    break;
                case 2:
                    MenuCon.hienThi();
                    break;
                case 3:
                    System.out.println("nhập biển cần xoá");
                    String bienKiemSoat = scanner.nextLine();
                    PhuongTien phuongTien = phuongTienService.timBienKiemSoat(bienKiemSoat);
                    if (phuongTien != null){
                        phuongTienService.xoaPhuogTien(bienKiemSoat);
                        System.out.println("xoá thành công");
                    }else {
                        System.out.println("không tồn tại");
                    }
                    break;
                default:
                    falg = false;
            }
        } while (falg);
    }
}
