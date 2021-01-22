package techInter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techInter.demo.entity.RodzajePotraw;
import techInter.demo.repository.RodzajePotrawRepository;

import java.util.List;

@Service
public class RodzajePotrawService {

    @Autowired
    private RodzajePotrawRepository rodzajePotrawRepository;

    public List<RodzajePotraw> getAll(){
        return rodzajePotrawRepository.findAll();
    }

}
