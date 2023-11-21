package Controllers;

import DAO.BookDAO;
import DAO.ReaderDAO;
import Model.Reader;
import NotificationSystem.Observer.LibraryNotificationSystem;
import NotificationSystem.Decorator.TimeStampDecorator;
import NotificationSystem.Observer.UserObserver;

import java.util.Scanner;

public class ReaderController {
    Scanner sc=new Scanner(System.in);
    private ReaderDAO readerDAO;
    private BookDAO bookDAO;
    private Reader reader;



    public void signUp(){
        LibraryNotificationSystem libraryNotificationSystem=new LibraryNotificationSystem();
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your email: ");
        String email = sc.next();

        System.out.println("Enter new password: ");
        String password = sc.next();

        reader = new Reader(name, email, password);

        System.out.println("Do you wanna get notification about new releases(Y/N)?");
        String yOrN=sc.next();
        if(yOrN.equals("Y")){
            System.out.println("Would you get messages with real date time?");
            yOrN= sc.next();
            if(yOrN.equals("Y")) {
                UserObserver timestampedObserver = new TimeStampDecorator(reader);
                libraryNotificationSystem.addObserver(timestampedObserver);
            }
            else{
                libraryNotificationSystem.addObserver(reader);
            }
        }
        readerDAO.signUp(reader);
    }

    public void removeUser() {
///////////////////////
    }


}
