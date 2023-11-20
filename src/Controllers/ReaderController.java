package Controllers;

import DAO.BookDAO;
import DAO.ReaderDAO;
import Model.Book;
import Model.Reader;

import java.util.Scanner;

public class ReaderController {
    Scanner sc=new Scanner(System.in);
    private static ReaderDAO readerDAO;
    private static BookDAO bookDAO;
    private Reader reader;

    public void assignLiterature(int readerId, Book book) {
        book.setAvailable(false);
        book.setReaderId(readerId);
        bookDAO.assign(book);

    }

    public static Reader signUp(String name,String email,String password){
        Reader newReader=new Reader(name,email,password);
        readerDAO.signUp(newReader);
        return newReader;
    }

    public static Reader signIn(String email,String password){
        Reader existingReader = new Reader(email, password);
        if (checkIsSigned(existingReader)) {
            System.out.println("Successfully signed in! " + "Welcome, " + existingReader.getName());
        }
        else {
            System.out.println("Invalid email or password!");
        }
        return existingReader;
    }
    public static boolean checkIsSigned(Reader reader){
        return readerDAO.check() == 1;
    }
}
