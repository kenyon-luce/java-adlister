import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class jdbcLecture {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                "root",
                "codeup");

        Statement statement = connection.createStatement();

        ResultSet selectResults = statement.executeQuery("SELECT * FROM albums");
// 'rs' is an instance of ResultSet
        while (selectResults.next()) {
            // do something with each row
            System.out.println("Here's and album");
            System.out.println("Artist: " + selectResults.getString("artist"));
            System.out.println("Name: " + selectResults.getString("name"));
            System.out.println("Release Date: " + selectResults.getString("release_date"));
            System.out.println("Genre: " + selectResults.getString("genre"));
            System.out.println("*------------------------------*");
        }

        String insertQuery = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES ('Nirvana', 'Bleach', 1989, 'punk rock', 0000)";

        Statement insertStatement = connection.createStatement();

        insertStatement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

        ResultSet insertResults = insertStatement.getGeneratedKeys();

        if(insertResults.next()){
            System.out.println("New insert has been created with an id of: " + insertResults.getInt(1));
        }
    }
}
