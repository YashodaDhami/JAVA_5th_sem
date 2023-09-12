import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) throws Exception {
        // Load the JDBC driver for the database
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movie_records", "root", "");

        // Create a Statement object
        Statement stmt = con.createStatement();

        // Execute the query and retrieve the result set
        ResultSet rs = stmt.executeQuery("SELECT * FROM movies WHERE genre = 'action'");

        // Iterate through the result set and print the movie details
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int releaseYear = rs.getInt("release_year");
            String genre = rs.getString("genre");

            System.out.println(
                    "ID: " + id + ", Name: " + name + ", Release Year: " + releaseYear + ", Genre: " + genre);
        }

        // Close the connection and statement
        con.close();
        stmt.close();
    }

}