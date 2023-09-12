import java.sql.*;

public class DatabaseInsertDemo {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_record", "root", "");
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student_yashoda");
            while (resultSet.next()) {

                System.out.println("Name: " + resultSet.getString(2));
                System.out.println("Address: " + resultSet.getString(3));
                System.out.println("Phone no: " + resultSet.getString(4));
                System.out.println("Email: " + resultSet.gethString(5));
            }
            statement.close();
            connect.close();
        } catch (Exception ignored) {
            ignored.printStackTrace();

        }
    }
}