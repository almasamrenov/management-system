package View;

import Controllers.ReaderController;
import Model.Reader;

import java.util.Scanner;

public class ClientSystem {
    Scanner sc=new Scanner(System.in);
    private Reader reader;
    public void start(){
        int signChoice=sc.nextInt();

        System.out.println("1.Sign in");
        System.out.println("2.Sign up");

        switch (signChoice){
            case 1->{
                System.out.println("Enter your email:");
                String email=sc.next();

                System.out.println("Enter your password:");
                String password=sc.next();

                reader = ReaderController.signIn(email, password);
            }
            case 2->{
                System.out.println("Enter your name: ");
                String name=sc.next();

                System.out.println("Enter your email: ");
                String email=sc.next();

                System.out.println("Enter new password: ");
                String password=sc.next();

                reader = ReaderController.signUp(name, email, password);
            }
        }

    }
}
