package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.XeMay;

public interface IXeMayRepository {
    XeMay[] timKiemAll();

    void themMoi(XeMay xeMay);

}
