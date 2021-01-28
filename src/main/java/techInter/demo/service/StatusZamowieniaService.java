package techInter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techInter.demo.entity.StatusZamowienia;
import techInter.demo.repository.StatusRepo;

@Service
public class StatusZamowieniaService {

    @Autowired
    private StatusRepo statusRepo;

    public StatusZamowienia pobierzWRealizacji(){
        return statusRepo.getOne(1L);
    }
}
