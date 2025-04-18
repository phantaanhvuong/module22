package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.PhuongTien;

import java.util.ArrayList;

public interface IPhuongTienRepository {

    void xoaPhuongTien(PhuongTien phuongTien);

    ArrayList<PhuongTien> timKiemAll();
    PhuongTien timBienKiemSoat(String bienKiemSoat);
}
