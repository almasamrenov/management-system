package DAO;

import Model.Book;
import Model.Reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {
    private final Connection conn;

    public BookDAO(Connection conn){
        this.conn=conn;
    }

    public void deleteBook(int id)  {
        try {
            PreparedStatement statement = conn.prepareStatement("DELETE FROM books where id=?", id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addBook(Book book) {
        try {
            PreparedStatement statement=conn.prepareStatement("INSERT INTO ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void assign(Book book) {
        try {
            PreparedStatement statement=conn.prepareStatement("UPDATE books SET readerId=?,isAvailavble=?");
            statement.setInt(1,book.getReaderId());
            statement.setBoolean(2,book.isAvailable());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
