package app.library_environment.separate_entities;

public class Reader {
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