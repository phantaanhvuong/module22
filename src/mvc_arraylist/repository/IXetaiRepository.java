package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.XeTai;

import java.util.ArrayList;

public interface IXetaiRepository {

    void xoaPhuongTien(XeTai xeTai);

    ArrayList<XeTai> timKiemAll();

    void themMoi(XeTai xeTai);
}
