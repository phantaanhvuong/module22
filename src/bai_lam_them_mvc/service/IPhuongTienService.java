package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.PhuongTien;

public interface IPhuongTienService {
    boolean xoaPhuogTien(String bienKiemSoat);
    PhuongTien timBienKiemSoat(String bienKiemSoat);
}
