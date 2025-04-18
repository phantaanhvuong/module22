package mvc_arraylist.repository;

import mvc_arraylist.entity.XeMay;

import java.util.ArrayList;

public class XeMayRepository implements IXeMayRepository {
    private static ArrayList<XeMay> xeMays = new ArrayList<>();
    static {
        xeMays.add(new XeMay("425343A","honda", 1890, "hoang", 300.0));
        xeMays.add(new XeMay("424669A","yamaha", 1979, "huy", 500.0));
    }

    @Override
    public void xoaPhuongTien(XeMay xeMay) {
        xeMays.remove(xeMay);
    }

    @Override
    public ArrayList<XeMay> timKiemAll() {
        return xeMays;
    }

    @Override
    public void themMoi(XeMay xeMay) {
       xeMays.add(xeMay);
    }
}
