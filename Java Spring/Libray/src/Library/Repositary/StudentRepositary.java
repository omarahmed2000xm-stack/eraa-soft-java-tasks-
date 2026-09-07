package Library.Repositary;

import Library.Db.DbConnection;
import Library.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepositary{
    public void saveStudent(Student student){

String sql="INSERT INTO STUDENTS (STUDENT_ID, NAME, PASSWORD, AGE) " +
        "VALUES (?, ?, ?, ?)";

try {
    Connection connection= DbConnection.getConnection();
    PreparedStatement statement= connection.prepareStatement(sql);
    statement.setInt(1, student.getId());
    statement.setString(2,student.getName());
statement.setString(3,student.getPassword());
statement.setInt(4,student.getId());

int affectedRows=statement.executeUpdate();
if (affectedRows>0){

    System.out.println("student saved successfully ");
}

} catch (SQLException e) {
    System.out.println("the problem is : "+ e.getMessage());
}
    }
}
