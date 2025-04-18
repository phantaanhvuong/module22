package mvc_arraylist.service;

import mvc_arraylist.entity.XeMay;

import java.util.ArrayList;

public interface IXeMayService {
    ArrayList<XeMay> timKiemAll();
    void themMoi(XeMay xeMay);
}
