package pl.pepliseb.biblio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pepliseb.biblio.model.Author;
import pl.pepliseb.biblio.repository.Displayable;

@Controller
public class HomeController {

    @Autowired
    private Displayable displayable;

    @GetMapping("/")
    public String index(ModelMap modelMap){
        Author a = new Author();
        a.setName("Adam");
        a.setSurname("Kowalski");
        modelMap.addAttribute("message",displayable.display(a));
        return "index";
    }
}

