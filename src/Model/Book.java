package Model;

public class Book {

    private String title;
    private int year;
    private boolean available;
    private String genre;
    private String author;
    private Publisher publisher;

    public Book(String title, int year, boolean available, String genre, String author, Publisher publisher) {
        this.title = title;
        this.year = year;
        this.available = available;
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
    }
}
