package View;

import Adapter.ListToExcelAdapter;
import Controllers.BookController;
import Controllers.ReaderController;

import java.util.Scanner;

public class System1 {
    public static void main(String[] args) {


    }
    private void start(){
        BookController bookController=new BookController();
        ReaderController readerController=new ReaderController();
        ListToExcelAdapter listToExcelAdapter=new ListToExcelAdapter();

        Scanner sc=new Scanner(System.in);
        System.out.println("Management for librarians");
        System.out.println("1.Add literature");
        System.out.println("2.Sign up reader");
        System.out.println("3.Assign reader to book");
        System.out.println("4.Release a book");
        System.out.println("4.Give analyze to workers");

        int choice=sc.nextInt();

        while(true){
            switch (choice){
                case 1-> bookController.createLiterature();
                case 2-> readerController.signUp();
                case 3-> bookController.assignLiterature();
                case 4-> bookController.releaseBook();
                case 5-> listToExcelAdapter.exportToExcel("C:\\Users\\Lenovo\\Desktop\\libraryData.xlsx");
            }
        }
    }
}
