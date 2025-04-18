package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.controller.PhuongTienController;
import bai_lam_them_mvc.entity.PhuongTien;
import bai_lam_them_mvc.entity.XeMay;

public interface IPhuongTienRepository {
    boolean xoaPhuongTien(String bienKiemSoat);
    PhuongTien[] timKiemAll();
}
