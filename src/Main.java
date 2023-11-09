import Database.DatabaseConnection;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        start();
    }
    private static void start() throws SQLException {
        DatabaseConnection db = DatabaseConnection.getInstance();
        Scanner sc=new Scanner(System.in);

        System.out.println("[1]-Sign in");
        System.out.println("[2]-Sign up");
        System.out.print("Enter: ");
        int choice= sc.nextInt();

        switch (choice){
            case 1: {

                System.out.println("Enter your email: ");
                String email = sc.next();
                System.out.println("Enter your password: ");
                String password= sc.next();
            }
            case 2:{

            }
        }
    }
}