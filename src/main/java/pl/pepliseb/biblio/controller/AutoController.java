package pl.pepliseb.biblio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutoController {

    @GetMapping("/authors/add")
    public String add(){
        return "authors/add";
    }
}
