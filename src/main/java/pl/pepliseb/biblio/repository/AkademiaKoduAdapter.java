package pl.pepliseb.biblio.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.pepliseb.biblio.model.Author;



@Primary
@Component
public class AkademiaKoduAdapter  implements Displayable {

private AkademiaKoduDisplay akademiaKoduDisplay = new AkademiaKoduDisplay();

    @Override
    public String display(Author author){
    return akademiaKoduDisplay.displayAuthor(author);
}

}
