package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;//содержат в себе тот самый одиночный обьект
    private Connection connection;
    private final String URL = "jdbc:postgresql://localhost:5432/library_management_system_db";
    private final String username = "postgres";
    private final String password = "12345";

    private DatabaseConnection() throws SQLException{
        try {
            this.connection = DriverManager.getConnection(URL, username, password);
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
        }
    }
    public Connection getConnection(){
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if(instance==null || instance.getConnection().isClosed())
            instance=new DatabaseConnection();

        return instance;
    }
}
