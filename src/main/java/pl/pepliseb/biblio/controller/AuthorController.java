package pl.pepliseb.biblio.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.pepliseb.biblio.model.Author;
import pl.pepliseb.biblio.repository.AuthorRepository;

@Controller
public class AuthorController {


    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors/add")
    public String add(){
        return "authors/add";
    }


    @PostMapping("/authors")
    public String create(@ModelAttribute Author author,RedirectAttributes redirectAttributes) {
        authorRepository.save(author);
        redirectAttributes.addFlashAttribute("message","Author saved");
        return "redirect:/authors";
    }

    @GetMapping("/authors")
    public String displayAll(ModelMap modelMap){
        modelMap.addAttribute("authors",authorRepository.findAll());
        return "authors/index";
    }

    @GetMapping("/authors/delete/{id}")
    public String deleteAuthor(@PathVariable Long id, RedirectAttributes redirectAttributes){
        authorRepository.deleteById(id);
        redirectAttributes.addFlashAttribute("message","Author deleted");
        return "redirect:/authors";
    }

    @GetMapping("/authors/edit/{id}")
    public String editPerson(@PathVariable Long id,ModelMap modelMap){
        modelMap.addAttribute("author",authorRepository.findById(id).get());
        return "authors/edit";
    }




}