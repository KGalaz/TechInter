package techInter.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class stronaGlownaController {

    @GetMapping
    public String index(){
        return "index";
    }
}
