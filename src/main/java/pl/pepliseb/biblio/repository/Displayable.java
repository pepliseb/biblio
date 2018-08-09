package pl.pepliseb.biblio.repository;

import pl.pepliseb.biblio.model.Author;

public interface Displayable {
    String display(Author author);
}
