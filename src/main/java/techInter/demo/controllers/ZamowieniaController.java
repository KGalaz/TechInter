package techInter.demo.controllers;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import techInter.demo.dto.PotrawaDto;
import techInter.demo.entity.Potrawy;
import techInter.demo.entity.RodzajePotraw;
import techInter.demo.entity.Zamowienie;
import techInter.demo.service.PotrawyService;
import techInter.demo.service.RodzajePotrawService;
import techInter.demo.service.ZamowienieService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/zamowienia")
public class ZamowieniaController {

    @Autowired
    private PotrawyService potrawyService;

    @Autowired
    private ZamowienieService zamowienieService;

    @Autowired
    private RodzajePotrawService rodzajePotrawService;

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
            lista.add(new PotrawaDto(lp, rodzajePotrawService.findById(lp.getRodzajPotrawy().getId())));
        });
        return lista;
    }

    @PostMapping("/zamow")
    public void Zamowienie(@RequestParam String adres, @RequestParam String na_kiedy) throws ParseException {
        System.out.println(adres);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(na_kiedy, format);
        System.out.println(dateTime);
    }

    @GetMapping("/test")
    public void Test() {
        List<Zamowienie> lista = zamowienieService.getAll();
        System.out.println(lista);
    }
}
