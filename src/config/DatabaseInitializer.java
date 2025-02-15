package config;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initializeDatabase() {
        Connection connection = null;
        try {
            connection = DatabaseConnection.getInstance().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (connection == null) {
            System.err.println("❌ Database connection is not available.");
            return;
        }

        try (Statement statement = connection.createStatement()) {
            // Load schema.sql from resources
            InputStream inputStream = DatabaseInitializer.class.getClassLoader().getResourceAsStream("resources/schema.sql");
            if (inputStream == null) {
                System.err.println("❌ schema.sql file not found in resources.");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder schemaSql = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                schemaSql.append(line).append("\n");
            }

            // Execute the schema SQL
            statement.execute(schemaSql.toString());
            System.out.println("✅ Database initialized successfully.");
        } catch (Exception e) {
            System.err.println("❌ Error initializing database: " + e.getMessage());
        }
    }
}