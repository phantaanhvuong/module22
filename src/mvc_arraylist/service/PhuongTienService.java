package mvc_arraylist.service;

import mvc_arraylist.entity.PhuongTien;
import mvc_arraylist.repository.*;

public class PhuongTienService implements IPhuongTienService {
    private final IPhuongTienRepository phuongTienRepository = new PhuongTienRepository();

    @Override
    public void xoaPhuongTien(PhuongTien phuongTien) {
        phuongTienRepository.xoaPhuongTien(phuongTien);

    }

    @Override
    public PhuongTien timBienKiemSoat(String bienKiemSoat) {
        return phuongTienRepository.timBienKiemSoat(bienKiemSoat);
    }
}
