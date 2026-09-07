package Library.Db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
     private static final String URL =
            "jdbc:oracle:thin:@//localhost:1521/orclpdb";
    private static final  String USER =  "System";
    private static final String PASSWORD= "NewPassword123";


    public static Connection getConnection()throws SQLException {
        return  DriverManager.getConnection(URL , USER ,PASSWORD);
    }
}
