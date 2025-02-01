package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password"; // Change this to your actual password

    public static Connection getConnection() throws SQLException {
        try {
            // Load the PostgreSQL driver explicitly
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL JDBC Driver not found. Include it in your classpath!", e);
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
