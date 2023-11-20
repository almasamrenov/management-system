package DAO;

import Model.Book;
import Model.Newspaper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewspaperDAO {
    private  final Connection conn;


    public NewspaperDAO(Connection conn) {
        this.conn = conn;
    }

    public void deleteNewspaper(Newspaper newspaper)  {
        try {
            PreparedStatement statement= conn.prepareStatement("");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addNewspaper(Newspaper newspaper) {
        try {
            PreparedStatement statement=conn.prepareStatement("INSERT INTO ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void assign() {
        try {
            PreparedStatement statement=conn.prepareStatement("UPDATE new SET ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
