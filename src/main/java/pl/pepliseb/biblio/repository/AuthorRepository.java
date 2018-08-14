package pl.pepliseb.biblio.repository;

import org.springframework.data.repository.CrudRepository;
import pl.pepliseb.biblio.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
