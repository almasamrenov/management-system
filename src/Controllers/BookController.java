package Controllers;

import DAO.BookDAO;
import Model.Book;

public class BookController {
    private BookDAO bookDAO;
    public void deleteBook(Book book){
        bookDAO.deleteBook(book);
    }

}
