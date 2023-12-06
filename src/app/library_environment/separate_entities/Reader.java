package app.library_environment.separate_entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Reader {
    @Autowired
    private Book book;

    public void giveBook() {
        book.read();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}