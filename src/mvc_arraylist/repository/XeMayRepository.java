package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.XeMay;
import ss12_set_map.bai_tap.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IXeMayRepository {
    private final String PHUONGTIEN_FILE = "src/mvc_arraylist/data/phuongtien.csv";
    private final boolean APPEND = true;
    private final boolean NO_APPEND = false;


    @Override
    public ArrayList<XeMay> timKiemAll() {
//        return xeMays;
        ArrayList<XeMay> xeMays1 = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(PHUONGTIEN_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            XeMay xeMay = new XeMay(array[0].trim(), array[1].trim(),
                    Integer.parseInt(array[2].trim()), array[3].trim(),
                    Double.parseDouble(array[4].trim()));
            xeMays1.add(xeMay);
        }
//
        return xeMays1;
    }

    @Override
    public void themMoi(XeMay xeMay) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeMay.getInForToFile2());
        ReadAndWriteFile.writeFile(PHUONGTIEN_FILE, stringList, APPEND);
    }

    @Override
    public void xoaPhuongTien(XeMay phuongTien) {
        List<XeMay> xeMayList = timKiemAll();
        xeMayList.remove(phuongTien);
        List<String> stringList = new ArrayList<>();
        for (XeMay xeMay : xeMayList) {
            stringList.add(xeMay.getInForToFile2());
        }
        ReadAndWriteFile.writeFile(PHUONGTIEN_FILE, stringList, NO_APPEND);
    }
}
