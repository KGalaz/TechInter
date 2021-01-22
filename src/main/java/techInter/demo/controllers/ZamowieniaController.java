package techInter.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import techInter.demo.dto.PotrawaDto;
import techInter.demo.entity.Potrawy;
import techInter.demo.service.PotrawyService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zamowienia")
public class ZamowieniaController {

    @Autowired
    private PotrawyService potrawyService;

    @GetMapping("")
    public String zamowienia(Model model){
        List<Potrawy> listaPotraw = potrawyService.getAll();
        List<PotrawaDto> listaPotrawDto = this.pobierzListePotraw(listaPotraw);
        model.addAttribute("listaPotrawDto", listaPotrawDto);
        return "zamowienia";
    }

    private List<PotrawaDto> pobierzListePotraw(List<Potrawy> potrawy) {
        List<PotrawaDto> lista = new ArrayList<>();
        potrawy.forEach(lp -> {
            lista.add(new PotrawaDto(lp, new String[]{"opis", "opis_2"}));
        });
        return lista;
    }
}
