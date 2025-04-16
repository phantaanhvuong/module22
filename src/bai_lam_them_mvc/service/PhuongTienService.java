package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.PhuongTien;
import bai_lam_them_mvc.repository.IPhuongTienRepository;
import bai_lam_them_mvc.repository.PhuongTienRepository;

public class PhuongTienService implements IPhuongTienService{
    private IPhuongTienRepository phuongTienRepository = new PhuongTienRepository();
    @Override
    public void xoaPhuogTien(String bienKiemSoat) {
        phuongTienRepository.xoaPhuongTien(bienKiemSoat);
    }

    @Override
    public PhuongTien timBienKiemSoat(String bienKiemSoat) {
        return phuongTienRepository.timBienKiemSoat(bienKiemSoat);
    }
}
