package mvc_arraylist.repository;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.entity.PhuongTien;
import mvc_arraylist.entity.XeMay;
import mvc_arraylist.entity.XeTai;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository implements IPhuongTienRepository {
    private static ArrayList<PhuongTien> phuongTiens = new ArrayList<>();
    private static IOtoRepository otoRepository = new OtoRepository();
    private static IXetaiRepository xetaiRepository = new XeTaiRepository();
    private static IXeMayRepository xeMayRepository = new XeMayRepository();


    @Override
    public void xoaPhuongTien(PhuongTien phuongTien) {
        if (phuongTien instanceof Oto){
            otoRepository.xoaPhuongTien((Oto) phuongTien);
        } else  if (phuongTien instanceof XeTai){
            xetaiRepository.xoaPhuongTien((XeTai) phuongTien);
        } else if (phuongTien instanceof XeMay){
            xeMayRepository.xoaPhuongTien((XeMay) phuongTien);
        }
    }

    @Override
    public List<PhuongTien> timKiemAll() {
        phuongTiens.addAll(otoRepository.timKiemAll());
        phuongTiens.addAll(xeMayRepository.timKiemAll());
        phuongTiens.addAll(xetaiRepository.timKiemAll());
        return phuongTiens;
    }

    @Override
    public PhuongTien timBienKiemSoat(String bienKiemSoat) {
        List<PhuongTien> phuongTiens1 = timKiemAll();
        for (int i = 0; i < phuongTiens1.size(); i++) {
            if (phuongTiens1.get(i).getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return phuongTiens1.get(i);
            }

        }
        return null;
    }
}
