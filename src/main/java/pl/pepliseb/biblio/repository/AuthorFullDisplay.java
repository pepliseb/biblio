package pl.pepliseb.biblio.repository;

import pl.pepliseb.biblio.model.Author;

public class AuthorFullDisplay implements Displayable {
    @Override
    public String display(Author author){
        return author.getName()+ " " + author.getSurname();
    }

}
