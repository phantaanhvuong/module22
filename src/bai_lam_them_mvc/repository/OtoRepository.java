package bai_lam_them_mvc.repository;

import bai_lam_them_mvc.entity.Oto;

public class OtoRepository implements IOtoRepository,IPhuongTienRepository {
    private static Oto[] otos = new Oto[2];
    static {
        otos[0] = new Oto("88078A","XXXX",1990,"Vuong",16,"du lịch");
        otos[1] = new Oto("88234A","VVVV",1660,"Minh",9,"phược");

    }



    @Override
    public Oto[] timKiemAll() {
        return otos;
    }

    @Override
    public void themMoi(Oto oto) {
        for (int i = 0; i < otos.length; i++) {
            if (otos[i] == null){
                otos[i] = oto;
                break;
            }
        }
    }

    @Override
    public boolean xoaPhuongTien(String bienKiemSoat) {
        for (int i = 0; i < otos.length; i++) {
            if (otos[i] != null && otos[i].getBienKiemSoat().equals(bienKiemSoat)) {
                for (int j = i; j < otos.length - 1; i++) {
                    otos[i] = otos[i + 1];
                }
                otos[otos.length - 1] = null;
                return true;
            }
        }
        return false;
    }
}
