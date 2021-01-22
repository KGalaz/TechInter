package techInter.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import techInter.demo.entity.Klient;
import techInter.demo.service.KlientService;

import java.util.List;

@Controller
@RequestMapping("/klienci")
public class KlinetController {

    @Autowired
    private KlientService klientService;

    @GetMapping
    public String test(Model model) {
        List<Klient> klientList = klientService.getAll();
        model.addAttribute("klienci", klientList);
        return "klient";
    }
}
