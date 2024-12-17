import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLException {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/new_db"; // Non-existent database
        String user = "root";
        String password = "VALENTIN"; // Incorrect credentials

        Connection connection = null;
        Statement statement = null;

        try {
            // Step 1: Attempt to connect to the database
            System.out.println("Trying to connect to the database...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");

            // Step 2: Create a statement and execute invalid SQL query
            statement = connection.createStatement();
            String invalidSQL = "SELEC * FRM invalid_table"; // Incorrect SQL syntax
            statement.execute(invalidSQL);

        } catch (java.sql.SQLException e) {
            // Catch and display SQL-related exceptions
            System.err.println("A SQLException has occurred:");
            System.err.println("Error Message: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
        } finally {
            // Step 3: Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (java.sql.SQLException ex) {
                System.err.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
}
