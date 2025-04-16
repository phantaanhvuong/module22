package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.XeTai;

public interface IXetaiRepository {
    XeTai[] timKiemAll();
    void themMoi(XeTai xeTai);
}
