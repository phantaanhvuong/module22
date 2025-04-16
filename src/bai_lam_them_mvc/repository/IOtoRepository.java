package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.Oto;

public interface IOtoRepository {
    Oto[] timKiemAll();
    void themMoi(Oto oto);

}
