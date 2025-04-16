package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.Oto;

public interface IOtoService {
    Oto[] timKiemAll();
    void themMoi(Oto oto);
}
