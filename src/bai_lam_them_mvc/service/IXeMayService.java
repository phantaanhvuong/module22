package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.XeMay;

public interface IXeMayService {
    XeMay[] timKiemAll();
    void themMoi(XeMay xeMay);
}
