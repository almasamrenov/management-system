package Model;

import java.util.List;

public class Publisher extends Person{
    private List<Book> books;
    private List<Reader> readers;

    public Publisher(String name, String email) {
        super(name, email);
    }
}
