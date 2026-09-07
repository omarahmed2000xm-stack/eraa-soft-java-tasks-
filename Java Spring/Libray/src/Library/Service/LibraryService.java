package Library.Service;

import Library.model.Books;
import Library.model.Order;
import Library.model.Student;

public interface LibraryService {
void addStudent(Student student);
void  addBooks(Books books);
Order createOrder(Student student);
void borrowBook(Order order,Books books,int quantity);
void  returnBook( Order order,Books books);
Books searchOnBook(String bookName);
void  displayOrders();

}
