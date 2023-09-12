import java.sql.*;

public class UpdateRecord {

  public static void main(String[] args) {
    // Load the JDBC driver
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println("Error loading driver: " + e);
    }

    // Connect to the database
    Connection conn = null;
    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "");

      // Create a statement
      Statement stmt = conn.createStatement();

      // Execute the UPDATE command
      stmt.executeUpdate("UPDATE employees SET salary=150000 WHERE id=4");

      System.out.println("Record updated successfully!");

      // Close the statement and connection
      stmt.close();
      conn.close();
    } catch (SQLException e) {
      System.out.println("Error connecting to the database: " + e);
    }
  }
}