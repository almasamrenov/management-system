package Controllers;

import DAO.BookDAO;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController implements LiteratureController,Observed {
    Scanner sc=new Scanner(System.in);
    private  BookDAO bookDAO;
    private  Book book;


    //factory
    @Override
    public void addLiterature(Publisher publisher) {
        System.out.print("Enter the title of the book:");
        String title=sc.next();
        System.out.println();

        System.out.print("Enter the year of the release: ");
        int year=sc.nextInt();
        System.out.println();

        System.out.print("Enter the author of the book: ");
        String author=sc.next();
        System.out.println();

        System.out.print("Enter the genre of the book: ");
        String genre=sc.next();

        System.out.println("Note: you will be add as publisher of this book!");

        book = new Book(title, year, publisher.getId(), author, true, genre);

        //notify observers////////////////////////////
        bookDAO.addBook(book);
    }

    @Override
    public void deleteLiterature(int id) {
        //notify observers////////////////////////////
        bookDAO.deleteBook(id);
    }



    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
