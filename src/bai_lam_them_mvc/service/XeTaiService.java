package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.XeTai;
import bai_lam_them_mvc.repository.IXetaiRepository;
import bai_lam_them_mvc.repository.XeTaiRepository;

public class XeTaiService implements IXeTaiService{
    private final IXetaiRepository xetaiRepository = new XeTaiRepository();


    @Override
    public XeTai[] timKiemAll() {
        return xetaiRepository.timKiemAll();
    }

    @Override
    public void themMoi(XeTai xeTai) {
        xetaiRepository.themMoi(xeTai);
    }
}
