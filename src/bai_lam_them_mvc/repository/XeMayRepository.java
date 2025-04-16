package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.XeMay;

public class XeMayRepository implements IXeMayRepository{
    private static XeMay[] xeMays = new XeMay[100];
    static {
        xeMays[0] = new XeMay("425343A","honda", 1890, "hoang", 300.0);
        xeMays[1] = new XeMay("424669A","yamaha", 1979, "huy", 500.0);
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
