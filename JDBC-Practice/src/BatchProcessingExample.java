import java.sql.*;

public class BatchProcessingExample {
    public static void main(String[] args) {
        // connecting to the database
        String serverName = "localhost";
        String myDatabase = "JavaJDBC";
        final String url = "jdbc:mysql://" + serverName + "/" + myDatabase;

        // username and password
        final String username = "root";
        final String password = "MyNewPass";
        try {
            // using static method of DriverManager
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Success: Database connection. " + connection);

            // creating statement
            Statement stmt = connection.createStatement();
            String SQL = "INSERT INTO MyGuests(firstname, lastname, email, reg_date) values('Mariam','Varkey','mariam@varkey.com','2019-03-12')";

            // adding to batch
            stmt.addBatch(SQL);

            // creating new SQL query
            SQL = "INSERT INTO MyGuests(firstname, lastname, email, reg_date) values('Anurag','BG','anurag@bg.com','2018-12-12')";

            // adding to batch
            stmt.addBatch(SQL);

            // executing batch
            int count[] = stmt.executeBatch();
            for (int i = 0; i < count.length; i++)
                System.out.println(count[i]);

        } catch (SQLException e) {
            System.out.println("Error: Couldn't connect to database " + e);
        }
    }
}
