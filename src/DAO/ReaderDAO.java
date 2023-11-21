package DAO;

import Database.DatabaseConnection;
import Model.Reader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReaderDAO {
    DatabaseConnection db=DatabaseConnection.getInstance();
    Connection conn= db.getConnection();

    public ReaderDAO() throws SQLException {
    }

    public int check() {
        return 0;
    }

    public void signUp(Reader newReader) {
    }
    public List<Reader> getListOfUsers(){
        try {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Books");
            ResultSet resultSet = statement.executeQuery();
            List<Reader>readers=new ArrayList<>();
            while (resultSet.next()) {

            }
            return readers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
