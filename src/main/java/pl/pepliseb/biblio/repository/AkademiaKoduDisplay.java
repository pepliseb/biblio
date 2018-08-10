package pl.pepliseb.biblio.repository;

import pl.pepliseb.biblio.model.Author;

public class AkademiaKoduDisplay {
    String displayAuthor(Author author){
        return "AkademiaKodu " + author.getName()+ " " author.getSurname();
    }
}
