package techInter.demo.controllers;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import techInter.demo.dto.Odpowiedz;
import techInter.demo.dto.PotrawaDto;
import techInter.demo.dto.ZamowienieDane;
import techInter.demo.entity.*;
import techInter.demo.repository.StatusRepo;
import techInter.demo.service.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zamowienia")
public class ZamowieniaController {

    @Autowired
    private PotrawyService potrawyService;

    @Autowired
    private SzczegolyZamowieniaService szczegolyZamowieniaService;

    @Autowired
    private RodzajePotrawService rodzajePotrawService;

    @Autowired
    private ZamowienieService zamowienieService;

    @Autowired
    private StatusZamowieniaService statusZamowieniaService;



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
    public ResponseEntity<?> Zamowienie(@RequestBody ZamowienieDane dane) throws ParseException {
        Odpowiedz odpowiedz = new Odpowiedz();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dane.getNa_kiedy(), format);
        odpowiedz.setText("Zamówienie zostało złożone. Dziękujemy");

        Map<String, Integer> koszyk = dane.getKoszyk();

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setStatusZamowienia(statusZamowieniaService.pobierzWRealizacji());
        zamowienie.setAdres(dane.getAdres());
        zamowienie.setNaKiedy(dateTime);
        zamowienie.setIdKlient(1L);
        Long idZamowienia = zamowienieService.zapiszIzwrocId(zamowienie);

        for (Map.Entry<String, Integer> entry : koszyk.entrySet()) {
            SzczegolyZamowienia szczegolyZamowienia = new SzczegolyZamowienia();
            szczegolyZamowienia.setIdPotrway(Integer.parseInt(entry.getKey()));
            szczegolyZamowienia.setIloscPotraw(entry.getValue());
            szczegolyZamowienia.setIdZamowienia(idZamowienia);
            Long ilosc = szczegolyZamowieniaService.pobierzIlosc();
            szczegolyZamowienia.setId(++ilosc);
            szczegolyZamowieniaService.dodaj(szczegolyZamowienia);
        }
        return new ResponseEntity<>(odpowiedz, HttpStatus.OK);
    }


}
