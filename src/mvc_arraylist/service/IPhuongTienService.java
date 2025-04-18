package mvc_arraylist.service;

import mvc_arraylist.entity.PhuongTien;

public interface IPhuongTienService {
   PhuongTien timBienKiemSoat(String bienKiemSoat);
   void xoaPhuongTien(PhuongTien phuongTien);
}
