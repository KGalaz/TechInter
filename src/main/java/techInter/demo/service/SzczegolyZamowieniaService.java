package techInter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techInter.demo.entity.SzczegolyZamowienia;
import techInter.demo.repository.SzczegolyZamowieniaRepo;

import java.util.List;

@Service
public class SzczegolyZamowieniaService {

    @Autowired
    private SzczegolyZamowieniaRepo szczegolyZamowieniaRepo;

    public Long pobierzIlosc(){
        return szczegolyZamowieniaRepo.count();
    }

    public void dodaj(SzczegolyZamowienia szczegolyZamowienia){
        szczegolyZamowieniaRepo.save(szczegolyZamowienia);
    }
}
