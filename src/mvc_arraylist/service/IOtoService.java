package mvc_arraylist.service;

import mvc_arraylist.entity.Oto;

import java.util.ArrayList;

public interface IOtoService {
    ArrayList<Oto> timKiemAll();
    void themMoi(Oto oto);
}
