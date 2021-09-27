import java.sql.*;

public class FirstJDBC {
    public static void main(String[] args) {
        // connecting to the database
        String serverName = "localhost";
        String myDatabase = "JavaJDBC";
        final String url = "jdbc:mysql://" + serverName + "/" + myDatabase;

        // initializing ResultSet
        ResultSet rs = null;

        // username and password
        final String username = "root";
        final String password = "MyNewPass";

        try {
            // using static method of DriverManager
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Success: Database connection. " + connection);

            // creating statement object
            // TYPE_SCROLL_SENSITIVE - The cursor can scroll forward and backward, and the result set
            // is sensitive to changes made by others to the database that occur after the result set
            // was created
            // CONCUR_READ_ONLY - Creates a read-only resultset. This is the default.
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            // executing SELECT query and returning ResultSet
            rs = stmt.executeQuery("SELECT * FROM MyGuests");

            // displaying results column wise
            System.out.println("id\t" + "firstname\t\t" + "lastname\t\t" + "email\t\t" + "reg_date\t");
            while(rs.next()){
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                String reg = rs.getString("reg_date");

                // updating row if id is 14
                if(id == 14){
                    rs.updateString("firstname","ravi");
                    rs.updateRow();
                }
                System.out.println(id + "\t" + firstname + "\t\t" + lastname + "\t\t" + email + "\t\t" + reg + "\t");
            }

        } catch(SQLException e){
            System.out.println("Error: Couldn't connect to database " + e);
        }
        finally{
            if(rs != null){
                try{
                    rs.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
