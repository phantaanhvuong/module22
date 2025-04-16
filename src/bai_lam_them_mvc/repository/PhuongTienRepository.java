package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.PhuongTien;

public class PhuongTienRepository implements IPhuongTienRepository {
    private PhuongTien[] phuongTiens = new PhuongTien[100];

    @Override
    public void xoaPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] != null && phuongTiens[i].getBienKiemSoat().equals(bienKiemSoat)) {
                for (int j = i; j < phuongTiens.length - 1; i++) {
                    phuongTiens[i] = phuongTiens[i + 1];
                }
                phuongTiens[phuongTiens.length - 1] = null;
            }
        }
    }

    @Override
    public PhuongTien timBienKiemSoat(String bienKiemSoat) {
        for (int i = 0; i < phuongTiens.length; i++) {
            if (phuongTiens[i] != null && phuongTiens[i].getBienKiemSoat().equals(bienKiemSoat)){
                return phuongTiens[i];
            }
        }
        return null;
    }
}
