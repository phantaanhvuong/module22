package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;

import java.util.ArrayList;

public interface IOtoRepository {
    ArrayList<Oto> timKiemAll();
    void themMoi(Oto oto);
//    boolean xoaPhuongTien(String bienKiemSoat);

    void xoaPhuongTien(Oto phuongTien);
}
