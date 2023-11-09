package DAO;

import Model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {
    private final Connection conn;

    public BookDAO(Connection conn){
        this.conn=conn;
    }

    public void deleteBook(Book book)  {
        try {
            PreparedStatement statement= conn.prepareStatement("");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
