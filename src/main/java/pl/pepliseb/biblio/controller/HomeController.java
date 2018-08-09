package pl.pepliseb.biblio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pepliseb.biblio.model.Author;
import pl.pepliseb.biblio.repository.AuthorDisplay;
import pl.pepliseb.biblio.repository.Displayable;

@Controller
public class HomeController {


    @Autowired
    private Displayable displayable;

    @GetMapping("/")
    public String index(){
        return "index";

    }

}
