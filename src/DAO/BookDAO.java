package DAO;

import Database.DatabaseConnection;
import Model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO implements DataSource{
    DatabaseConnection db=DatabaseConnection.getInstance();
    Connection conn= db.getConnection();


    public BookDAO(Connection conn) throws SQLException {
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



    @Override
    public List<Book> getData() {
        try {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Books");
            ResultSet resultSet = statement.executeQuery();
            List<Book> books = new ArrayList<>();
            while (resultSet.next()) {

            }
            return books;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void releaseBook(Book book) {
    }
}
