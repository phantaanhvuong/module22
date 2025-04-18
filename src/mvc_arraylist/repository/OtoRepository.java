package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;

import java.util.ArrayList;

public class OtoRepository implements IOtoRepository{
    private static ArrayList<Oto> otos = new ArrayList<>();
    static {
        otos.add(new Oto("88078A","XXXX",1990,"Vuong",16,"du lịch"));
        otos.add(new Oto("88234A","VVVV",1660,"Minh",9,"phược"));

    }


    @Override
    public ArrayList<Oto> timKiemAll() {
        return otos;
    }

    @Override
    public void themMoi(Oto oto) {
            otos.add(oto);


    }

    @Override
    public void xoaPhuongTien(Oto oto) {
           otos.remove(oto);

    }
}
