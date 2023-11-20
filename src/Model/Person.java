package Model;

public class Person {
    private int id;

    public int getId() {
        return id;
    }

    private  String name;
    private  String email;
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Person(String email,String password){
        this.email = email;
        this.password = password;
    }
    public Person(String name, String email,String password) {
        this.name = name;
        this.email = email;
        this.password=password;
    }
}
