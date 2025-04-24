package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.XeMay;

import java.util.ArrayList;

public interface IXeMayRepository {


    ArrayList<XeMay> timKiemAll();

    void themMoi(XeMay xeMay);
    void xoaPhuongTien(XeMay phuongTien);
}
