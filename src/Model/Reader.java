package Model;

import java.util.List;

public class Reader extends Person {
    private int id;



    public Reader(String name, String email, String password) {
        super(name, email,password);
    }
    public Reader(String email,String password){
        super(email,password);
    }
    public int getId() {
        return id;
    }
}
