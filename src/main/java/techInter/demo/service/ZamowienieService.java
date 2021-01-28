package techInter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techInter.demo.entity.Zamowienie;
import techInter.demo.repository.ZamowienieRepository;

import java.util.List;

@Service
public class ZamowienieService {

    @Autowired
    private ZamowienieRepository zamowienieRepository;

    public List<Zamowienie> getAll(){
        return zamowienieRepository.findAll();
    }

    public Long iloscZamowien() {
        return zamowienieRepository.count();
    }

    public Long zapiszIzwrocId(Zamowienie zamowienie){
        Zamowienie zam = zamowienieRepository.save(zamowienie);
        return zam.getId();
    }

}
