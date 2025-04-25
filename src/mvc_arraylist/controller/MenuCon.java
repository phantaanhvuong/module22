package mvc_arraylist.controller;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.XeMay;
import mvc_arraylist.entity.XeTai;
import mvc_arraylist.service.OtoService;
import mvc_arraylist.service.XeMayService;
import mvc_arraylist.service.XeTaiService;
import mvc_arraylist.view.OtoView;
import mvc_arraylist.view.XeMayView;
import mvc_arraylist.view.XeTaiView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCon {
    public static void hienThi(){
        OtoService otoService = new OtoService();
        XeMayService xeMayService = new XeMayService();
        XeTaiService xeTaiService = new XeTaiService();
        boolean falg = true;
        do {
            System.out.println("Hiển thị phương tiện"+
                    "\n 1. hiển thị xe tải"+
                    "\n 2. hiển thị xe ôtô"+
                    "\n 3. hiển thị xe máy"+
                    "\n 4. quay lại menu"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    ArrayList<XeTai> xeTais = xeTaiService.timKiemAll();
                    XeTaiView.displayXeTai(xeTais);
                    break;
                case 2:
                    List<Oto> otos = otoService.timKiemAll();
                    OtoView.displayOto(otos);
                    break;
                case 3:
                    ArrayList<XeMay> xeMays = xeMayService.timKiemAll();
                    XeMayView.displayXeMay(xeMays);
                    break;
                case 4:
                    return;
            }
        }while (falg);

    }
    public static void themMoi() {
        OtoService otoService = new OtoService();
        XeTaiService xeTaiService = new XeTaiService();
        XeMayService xeMayService = new XeMayService();
        boolean falg = true;
        do {
            System.out.println("Hiển thị phương tiện" +
                    "\n 1. thêm xe tải" +
                    "\n 2. thêm xe ôtô" +
                    "\n 3. thêm xe máy" +
                    "\n 4. quay lại menu"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    XeTai xeTai = XeTaiView.themMoiXeTai();
                    xeTaiService.themMoi(xeTai);
                    break;
                case 2:
                    Oto oto = OtoView.themMoiOto();
                    otoService.themMoi(oto);
                    break;
                case 3:
                    XeMay xeMay = XeMayView.themMoiXeMay();
                    xeMayService.themMoi(xeMay);

                    break;
                case 4:
                    return;
            }
        }while (falg);

    }
}
