package Model;

import java.util.List;

public class Reader extends Person{
    List<Book>books;

    public Reader(String name, String email) {
        super(name, email);
    }
}
