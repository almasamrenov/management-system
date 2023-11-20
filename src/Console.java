import Controllers.ReaderController;
import View.AdminSystem;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

    }
    private static void start(){
        Scanner sc=new Scanner(System.in);
        boolean system=true;





//            System.out.println("[1]Sign in:");
//            System.out.println("[2]Sign up:");
//            int n = sc.nextInt();
//            String email;
//            String password;
//            String name;
//            switch (n) {
//                case 1 -> {
//                    System.out.print("Enter your email: ");
//                    email = sc.next();
//                    System.out.print("Enter your password: ");
//                    password = sc.next();
//                    Reader existingReader = new Reader(email, password);
//                    if (existingReader.check()) {
//                        System.out.println("Successfully signed in! " + "Welcome, " + existingReader.getName());
//                        stop = false;
//                    } else {
//                        System.out.println("Invalid email or password!");
//                    }
//                }
//                case 2 -> {
//                    System.out.println("Enter your name:");
//                    name=sc.next();
//                    System.out.print("Enter your email: ");
//                    email = sc.next();
//                    System.out.print("Enter your password: ");
//                    password = sc.next();
//                    Reader newReader = new Reader(name, email, password);
//                    System.out.println("Successfully signed up!"+"Welcome, "+name);
//                }
//                default -> System.out.println("Invalid choice. Please try again");
//            }
//        System.out.println("1.Add book");
//        System.out.println("2.Delete book");
//        BookController bookController=new BookController();
//        NewspaperController newspaperController=new NewspaperController();
//        int choice=sc.nextInt();
//        Publisher publisher=new Publisher("kdlsn","sdknlf","dsnk");
//        switch (choice){
//                case 1-> bookController.addLiterature(publisher);
//
////                case 2-> bookController.assignLiterature();
//
//                case 3-> bookController.deleteLiterature(publisher.getId());
//
//        }
//        int choice2=sc.nextInt();
//        switch (choice2){
//            case 1->newspaperController.addLiterature(publisher);
//            case 2->newspaperController.assignLiterature();
//            case 3->newspaperController.deleteLiterature(2);
//        }
    }

}
