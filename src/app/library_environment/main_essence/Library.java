package app.library_environment.main_essence;

import app.library_environment.separate_entities.Reader;
import app.library_environment.staff.administration.Director;
import org.springframework.beans.factory.annotation.Autowired;

public class Library {
    @Autowired
    private Reader reader;
    @Autowired
    private Director director;

    public void manageLibrary() {
        reader.giveBook();
        director.manage();
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}