package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.XeMay;

public class XeMayRepository implements IXeMayRepository,IPhuongTienRepository{
    private static XeMay[] xeMays = new XeMay[2];
    static {
        xeMays[0] = new XeMay("425343A","honda", 1890, "hoang", 300.0);
        xeMays[1] = new XeMay("424669A","yamaha", 1979, "huy", 500.0);
    }

    @Override
    public boolean xoaPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < xeMays.length; i++) {
            if (xeMays[i] != null && xeMays[i].getBienKiemSoat().equals(bienKiemSoat)) {
                for (int j = i; j < xeMays.length - 1; i++) {
                    xeMays[i] = xeMays[i + 1];
                }
                xeMays[xeMays.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public XeMay[] timKiemAll() {
        return xeMays;
    }

    @Override
    public void themMoi(XeMay xeMay) {
        for (int i = 0; i < xeMays.length; i++) {
            if (xeMays[i] == null){
                xeMays[i] = xeMay;
                break;
            }
        }
    }
}
