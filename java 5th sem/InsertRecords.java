import java.sql.*;

public class InsertRecords {

  public static void main(String[] args) {
    // Load the JDBC driver
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println("Error loading driver: " + e);
    }

    // Connect to the database

    try {
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/movie_records", "root", "");

      // Create a statement
      Statement stmt = conn.createStatement();

      // Insert 5 records into the "movies" table
      stmt.executeUpdate("INSERT INTO movies ( name, release_year, genre) VALUES ('Movie 1', 2020, 'Action')");
      stmt.executeUpdate("INSERT INTO movies ( name, release_year, genre) VALUES ('Movie 2', 2021, 'Comedy')");
      stmt.executeUpdate("INSERT INTO movies ( name, release_year, genre) VALUES ('Movie 3', 2022, 'Drama')");
      stmt.executeUpdate("INSERT INTO movies ( name, release_year, genre) VALUES ('Movie 4', 2023, 'Thriller')");
      stmt.executeUpdate("INSERT INTO movies ( name, release_year, genre) VALUES ('Movie 5', 2024, 'Romance')");

      System.out.println("Records inserted successfully!");

      // Close the statement and connection
      stmt.close();
      conn.close();
    } catch (SQLException e) {
      System.out.println("Error connecting to the database: " + e);
    }
  }
}
