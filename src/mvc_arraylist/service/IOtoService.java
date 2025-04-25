package mvc_arraylist.service;

import mvc_arraylist.entity.Oto;

import java.util.ArrayList;
import java.util.List;

public interface IOtoService {
    List<Oto> timKiemAll();
    void themMoi(Oto oto);
}
