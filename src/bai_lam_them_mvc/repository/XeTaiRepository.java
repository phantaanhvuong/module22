package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.XeTai;

public class XeTaiRepository implements IXetaiRepository,IPhuongTienRepository {
    private static XeTai[] xeTais = new XeTai[10];
    static {
        xeTais[0] = new XeTai("54646C", "MMM", 1676,"hoa",10000);
        xeTais[1] = new XeTai("54879C", "JQK", 1869,"ly",20000);

    }

    @Override
    public boolean xoaPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < xeTais.length; i++) {
            if (xeTais[i] != null && xeTais[i].getBienKiemSoat().equals(bienKiemSoat)) {
                for (int j = i; j < xeTais.length - 1; i++) {
                    xeTais[i] = xeTais[i + 1];
                }
                xeTais[xeTais.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public XeTai[] timKiemAll() {
        return xeTais;
    }

    @Override
    public void themMoi(XeTai xeTai) {
        for (int i = 0; i < xeTais.length; i++) {
            if (xeTais[i] == null){
                xeTais[i] = xeTai;
                break;
            }
        }
    }
}
