package techInter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techInter.demo.entity.Potrawy;
import techInter.demo.repository.PotrawyRepository;

import java.util.List;

@Service
public class PotrawyService {

    @Autowired
    private PotrawyRepository potrawyRepository;

    public List<Potrawy> getAll(){
        return potrawyRepository.findAll();
    }

}
