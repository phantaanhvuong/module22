package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.PhuongTien;
import bai_lam_them_mvc.repository.*;

public class PhuongTienService implements IPhuongTienService {
    private IPhuongTienRepository[] phuongTienRepository = {
            new OtoRepository(),
            new XeMayRepository(),
            new XeTaiRepository()
    };

    @Override
    public boolean xoaPhuogTien(String bienKiemSoat) {
        for (IPhuongTienRepository repository : phuongTienRepository) {
            if (repository.xoaPhuongTien(bienKiemSoat)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PhuongTien timBienKiemSoat(String bienKiemSoat) {
        for (IPhuongTienRepository repository : phuongTienRepository) {
            for (PhuongTien phuongTien : repository.timKiemAll())
                if (phuongTien != null && phuongTien.getBienKiemSoat().equals(bienKiemSoat)) {
                    return phuongTien;

                }
        }
        return null;
    }
}
