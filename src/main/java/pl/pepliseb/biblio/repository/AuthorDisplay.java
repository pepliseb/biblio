package pl.pepliseb.biblio.repository;

import org.springframework.stereotype.Component;
import pl.pepliseb.biblio.model.Author;


@Component
public class AuthorDisplay implements Displayable {


    @Override
    public String display(Author author){
        return author.getName();
    }
}
