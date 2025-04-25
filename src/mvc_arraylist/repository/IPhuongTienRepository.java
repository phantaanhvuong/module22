package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public interface IPhuongTienRepository {

    void xoaPhuongTien(PhuongTien phuongTien);

    List<PhuongTien> timKiemAll();
    PhuongTien timBienKiemSoat(String bienKiemSoat);
}
