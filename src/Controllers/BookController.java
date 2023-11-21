package Controllers;

import DAO.BookDAO;
import Model.Book;
import NotificationSystem.Observer.LibraryNotificationSystem;
import NotificationSystem.Strategy.NotificationType;

import java.util.List;
import java.util.Scanner;

public class BookController implements LiteratureController {
    Scanner sc=new Scanner(System.in);
    private  BookDAO bookDAO;
    private  Book book;
    private LibraryNotificationSystem libraryNotificationSystem;

    //factory
    @Override
    public void createLiterature() {
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

        book = new Book(title, year,  author, true, genre);

        bookDAO.addBook(book);
        libraryNotificationSystem.notifyObservers("Hi, we have message for you! \nAdded new book: "+book.toString(), NotificationType.NEW_BOOK);
    }

    @Override
    public void deleteLiterature() {
        System.out.println("Input id");
        int id= sc.nextInt();
        /////////////////////////
        bookDAO.deleteBook(id);
    }


    public void releaseBook(){
        //////////////////////////////
        System.out.println("Input id:");
        bookDAO.releaseBook(book);
        libraryNotificationSystem.notifyObservers("Just released "+book.toString(),NotificationType.RELEASED_BOOK);
    }

   public int returnAllBook(){
        ////////////////////////
      List<Book> list=bookDAO.getData();
       System.out.println("Input the id of literature that you want:");
      return  sc.nextInt();
   }
    public void assignLiterature() {
        /////////////////////
        book.setAvailable(false);
//        book.setReaderId();
        bookDAO.assign(book);
    }

}
