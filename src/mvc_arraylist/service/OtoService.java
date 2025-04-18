package mvc_arraylist.service;

import mvc_arraylist.entity.Oto;
import mvc_arraylist.repository.IOtoRepository;
import mvc_arraylist.repository.OtoRepository;

import java.util.ArrayList;

public class OtoService implements IOtoService {
    private final IOtoRepository otoRepository = new OtoRepository();


    @Override
    public ArrayList<Oto> timKiemAll() {
        return otoRepository.timKiemAll();
    }

    @Override
    public void themMoi(Oto oto){
        otoRepository.themMoi(oto);
    }
}
