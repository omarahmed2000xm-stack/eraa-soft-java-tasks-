package Library.Repositary;

import Library.Db.DbConnection;
import Library.model.Books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BooksRepositary {
    public void saveBook(Books book) {

        String sql =
                "INSERT INTO BOOKS (BOOK_ID, NAME, PRICE, QUANTITY) " +
                        "VALUES (?, ?, ?, ?)";

        try (
                Connection connection = DbConnection.getConnection();
                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {

            statement.setInt(1, book.getId());
            statement.setString(2, book.getName());
            statement.setDouble(3, book.getPrice());
            statement.setInt(4, book.getQuantiy());

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Book saved successfully");
            }

        } catch (SQLException e) {
            System.out.println("The problem is: " + e.getMessage());
            e.printStackTrace();
        }


    }
}
