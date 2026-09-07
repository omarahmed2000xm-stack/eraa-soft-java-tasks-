import Library.Db.DbConnection;
import Library.LibraryServiceImpl;
import Library.Repositary.BooksRepositary;
import Library.model.Books;

import java.sql.Connection;

public class Main {
    public static void main (String[] args){


        Books book = new Books(
                "Java Programming",
                1,

                300.00,
                10
        );

        BooksRepositary booksRepository =
                new BooksRepositary();

        booksRepository.saveBook(book);

    }
}