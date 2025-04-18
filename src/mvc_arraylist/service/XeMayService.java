package mvc_arraylist.service;

import mvc_arraylist.entity.XeMay;
import mvc_arraylist.repository.IXeMayRepository;
import mvc_arraylist.repository.XeMayRepository;

import java.util.ArrayList;

public class XeMayService implements IXeMayService {
    private final IXeMayRepository xeMayRepository = new XeMayRepository();

    @Override
    public ArrayList<XeMay> timKiemAll() {
        return xeMayRepository.timKiemAll();
    }

    @Override
    public void themMoi(XeMay xeMay) {
        xeMayRepository.themMoi(xeMay);
    }
}
