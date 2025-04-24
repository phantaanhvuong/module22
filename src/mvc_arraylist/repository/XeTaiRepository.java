package mvc_arraylist.repository;


import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.XeTai;
import ss12_set_map.bai_tap.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXetaiRepository {
    private final String PHUONGTIEN_FILE = "src/mvc_arraylist/data/phuongtien.csv";
    private final boolean APPEND = true;
    private final boolean NO_APPEND = false;
    private static ArrayList<XeTai> xeTais = new ArrayList<>();

    static {
        xeTais.add(new XeTai("54646C", "MMM", 1676, "hoa", 10000));
        xeTais.add(new XeTai("54879C", "JQK", 1869, "ly", 20000));

    }

    @Override
    public void xoaPhuongTien(XeTai phuongTien) {
        List<XeTai> xeTais1 = timKiemAll();

        xeTais1.remove(phuongTien);

        List<String> stringList = new ArrayList<>();
        for (XeTai xeTai : xeTais1) {
            stringList.add(xeTai.getInForToFile3());
        }
        ReadAndWriteFile.writeFile(PHUONGTIEN_FILE, stringList, NO_APPEND);
    }

    @Override
    public ArrayList<XeTai> timKiemAll() {
        ArrayList<XeTai> xeTais1 = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(PHUONGTIEN_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            XeTai xeTai = new XeTai(array[0].trim(), array[1].trim(),
                    Integer.parseInt(array[2].trim()), array[3].trim(),
                    Integer.parseInt(array[4].trim()));
            xeTais1.add(xeTai);
        }
//
        return xeTais1;
    }

    @Override
    public void themMoi(XeTai xeTai) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeTai.getInForToFile3());
        ReadAndWriteFile.writeFile(PHUONGTIEN_FILE, stringList, APPEND);
    }
}
