package bai_lam_them_mvc.service;

import bai_lam_them_mvc.entity.Oto;
import bai_lam_them_mvc.repository.IOtoRepository;
import bai_lam_them_mvc.repository.OtoRepository;

public class OtoService implements IOtoService {
    private IOtoRepository otoRepository = new OtoRepository();


    @Override
    public Oto[] timKiemAll() {
        return otoRepository.timKiemAll();
    }

    @Override
    public void themMoi(Oto oto){
        otoRepository.themMoi(oto);
    }
}
