package modelo;

import java.awt.print.Book;
import java.util.List;

public class Author {
    private int id;
    private String name;
    private List<Book> books; // relación 1:N

    public Author() {}

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
