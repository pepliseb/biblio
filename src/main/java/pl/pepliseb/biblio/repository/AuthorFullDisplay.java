package pl.pepliseb.biblio.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.pepliseb.biblio.model.Author;

@Primary
@Component
public class AuthorFullDisplay implements Displayable {

    @Override
    public String display(Author author){
        return author.getName()+ " " + author.getSurname();
    }

}
