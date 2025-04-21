package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.Oto;
import bai_lam_them_mvc.entity.PhuongTien;
import bai_lam_them_mvc.entity.XeMay;
import bai_lam_them_mvc.entity.XeTai;

public class PhuongTienRepository implements IPhuongTienRepository {
    private PhuongTien[] phuongTiens = new PhuongTien[30];

    @Override
    public boolean xoaPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] != null && phuongTiens[i].getBienKiemSoat().equals(bienKiemSoat)) {
                for (int j = i; j < phuongTiens.length - 1; i++) {
                    phuongTiens[i] = phuongTiens[i + 1];
                }
                phuongTiens[phuongTiens.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public PhuongTien[] timKiemAll() {
        return phuongTiens;
    }

//    @Override
//    public PhuongTien timBienKiemSoat(String bienKiemSoat) {
//        for (int i = 0; i < phuongTiens.length; i++) {
//            if (phuongTiens[i] != null && phuongTiens[i].getBienKiemSoat().equals(bienKiemSoat)){
//                return phuongTiens[i];
//            }
//        }
//        return null;
//    }
}
