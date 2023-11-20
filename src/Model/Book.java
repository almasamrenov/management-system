package Model;

public class Book  extends Literature {
    private String author;
    private boolean available;
    private String genre;
    private int readerId;

    public Book(String title, int year, int publisherId,  String author, boolean available, String genre) {
        super(title,year,publisherId);
        this.author = author;
        this.available = available;
        this.genre = genre;
    }

    public int getReaderId() {
        return readerId;
    }
    public void setReaderId(int readerId){
        this.readerId=readerId;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
