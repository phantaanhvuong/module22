package mvc_arraylist.repository;

import mvc_arraylist.entity.XeMay;

import java.util.ArrayList;

public interface IXeMayRepository {

    void xoaPhuongTien(XeMay xeMay);

    ArrayList<XeMay> timKiemAll();

    void themMoi(XeMay xeMay);
}
