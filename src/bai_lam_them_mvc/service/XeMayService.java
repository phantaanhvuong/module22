package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.XeMay;
import bai_lam_them_mvc.repository.IXeMayRepository;
import bai_lam_them_mvc.repository.XeMayRepository;

public class XeMayService implements IXeMayService {
    private IXeMayRepository xeMayRepository = new XeMayRepository();

    @Override
    public XeMay[] timKiemAll() {
        return xeMayRepository.timKiemAll();
    }

    @Override
    public void themMoi(XeMay xeMay) {
        xeMayRepository.themMoi(xeMay);
    }
}
