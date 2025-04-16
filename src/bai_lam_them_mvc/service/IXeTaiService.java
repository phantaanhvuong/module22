package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.XeTai;

public interface IXeTaiService {
    XeTai[] timKiemAll();
    void themMoi(XeTai xeTai);
}
