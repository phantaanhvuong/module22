package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import ss12_set_map.bai_tap.entity.Product;
import ss12_set_map.bai_tap.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private final String PHUONGTIEN_FILE ="src/mvc_arraylist/data/phuongtien.csv";
    private final boolean APPEND = true;
    private final boolean NO_APPEND = false;
//    private static ArrayList<Oto> otos = new ArrayList<>();
//    static {
//        otos.add(new Oto("88078A","XXXX",1990,"Vuong",16,"du lịch"));
//        otos.add(new Oto("88234A","VVVV",1660,"Minh",9,"phược"));
//
//    }


    @Override
    public ArrayList<Oto> timKiemAll() {
//        return otos;
        ArrayList<Oto> otos1 = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(PHUONGTIEN_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Oto  oto = new Oto(array[0].trim(),array[1].trim(),
                    Integer.parseInt(array[2].trim()),array[3].trim(),
                    Integer.parseInt(array[4].trim()), array[5].trim());
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
        ReadAndWriteFile.writeFile(PHUONGTIEN_FILE,stringList,APPEND);

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
        ReadAndWriteFile.writeFile(PHUONGTIEN_FILE,stringList,NO_APPEND);

    }


}
