package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.util.ReadAndWriteFile;
import ss12_set_map.bai_tap.entity.Product;


import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private final String OTO_FILE ="src/mvc_arraylist/data/oto.csv";
    private final boolean APPEND = true;
    private final boolean NO_APPEND = false;
//    private static ArrayList<Oto> otos = new ArrayList<>();
//    static {
//        otos.add(new Oto("88078A","XXXX",1990,"Vuong",16,"du lịch"));
//        otos.add(new Oto("88234A","VVVV",1660,"Minh",9,"phược"));
//
//    }


    @Override
    public List<Oto> timKiemAll() {
//        return otos;
        List<Oto> otos1 = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(OTO_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Oto oto = new Oto(array[0],array[1],
                    Integer.parseInt(array[2]),array[3],
                    array[4], Integer.parseInt(array[5]));
            otos1.add(oto);
        }
//
        return otos1;
    }

    @Override
    public void themMoi(Oto oto) {
//            otos.add(oto);
        List<String> stringList = new ArrayList<>();
        stringList.add(oto.getInForToFile1());
        ReadAndWriteFile.writeFile(OTO_FILE,stringList,APPEND);

    }

//    @Override
//    public boolean xoaPhuongTien(String bienKiemSoat) {
//        List<Oto> otoList = timKiemAll();
//        boolean check = false;
//        for (int i = 0; i < otoList.size(); i++) {
//            if (bienKiemSoat.equals(otoList.get(i).getBienKiemSoat())) {
//                check = true;
//                otoList.remove(i);
//                break;
//            }
//        }
//        if (check) {
//            List<String> stringList = new ArrayList<>();
//            for (Oto oto : otoList) {
//                stringList.add(oto.getInForToFile1());
//            }
//            ReadAndWriteFile.writeFile(PHUONGTIEN_FILE, stringList, NO_APPEND);
//        }
//
//        return check;
//    }

    @Override
    public void xoaPhuongTien(Oto phuongTien) {
        List<Oto> otoList = timKiemAll();
        otoList.remove(phuongTien);
        List<String>stringList = new ArrayList<>();
        for (Oto oto : otoList){
            stringList.add(oto.getInForToFile1());
        }
        ReadAndWriteFile.writeFile(OTO_FILE,stringList,NO_APPEND);

    }


}
