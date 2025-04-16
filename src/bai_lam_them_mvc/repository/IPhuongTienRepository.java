package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.controller.PhuongTienController;
import bai_lam_them_mvc.entity.PhuongTien;

public interface IPhuongTienRepository {
    void xoaPhuongTien(String bienKiemSoat);
    PhuongTien timBienKiemSoat(String bienKiemSoat);
}
