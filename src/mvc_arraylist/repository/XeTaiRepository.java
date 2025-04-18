package mvc_arraylist.repository;


import mvc_arraylist.entity.XeTai;

import java.util.ArrayList;

public class XeTaiRepository implements IXetaiRepository {
    private static ArrayList<XeTai> xeTais = new ArrayList<>();
    static {
        xeTais.add(new XeTai("54646C", "MMM", 1676,"hoa",10000));
        xeTais.add(new XeTai("54879C", "JQK", 1869,"ly",20000));

    }

    @Override
    public void xoaPhuongTien(XeTai xeTai) {
        xeTais.remove(xeTai);
    }

    @Override
    public ArrayList<XeTai> timKiemAll() {
        return xeTais;
    }

    @Override
    public void themMoi(XeTai xeTai) {

    }
}
