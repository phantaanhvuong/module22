package mvc_arraylist.service;

import mvc_arraylist.entity.XeTai;
import mvc_arraylist.repository.IXetaiRepository;
import mvc_arraylist.repository.XeTaiRepository;

import java.util.ArrayList;

public class XeTaiService implements IXeTaiService {
    private final IXetaiRepository xetaiRepository = new XeTaiRepository();


    @Override
    public ArrayList<XeTai> timKiemAll() {
        return xetaiRepository.timKiemAll();
    }

    @Override
    public void themMoi(XeTai xeTai) {
        xetaiRepository.themMoi(xeTai);
    }
}
