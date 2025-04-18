package mvc_arraylist.service;

import mvc_arraylist.entity.XeTai;

import java.util.ArrayList;

public interface IXeTaiService {
    ArrayList<XeTai> timKiemAll();
    void themMoi(XeTai xeTai);
}
