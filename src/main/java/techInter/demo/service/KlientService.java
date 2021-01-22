package techInter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techInter.demo.entity.Klient;
import techInter.demo.repository.KlientRepository;

import java.util.List;

@Service
public class KlientService {

    @Autowired
    private KlientRepository klientRepository;

    public List<Klient> getAll(){
        return klientRepository.findAll();
    }
}
