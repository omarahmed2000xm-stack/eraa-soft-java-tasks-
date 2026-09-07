package Library;

import Library.Service.LibraryService;
import Library.model.Books;
import Library.model.Order;
import Library.model.OrderLine;
import Library.model.Student;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    List<Books>booksList;
    List<Student>students;
    List<Order>orders;

    public LibraryServiceImpl(List<Books> books, List<Student> students, List<Order> orders) {
        this.booksList = new ArrayList<>();
        this.students = new ArrayList<>();
        this.orders = new ArrayList<>();
    }


    @Override


    public void addStudent(Student student) {

    }

    @Override
    public void addBooks(Books books) {
boolean exist=booksList.stream().anyMatch(b->b.getName().equalsIgnoreCase(books.getName()));
if (exist){
    System.out.println("book is already exist ");
}else {
    booksList.add(books);
    System.out.println("book is added ");
}

    }

    @Override
    public Order createOrder(Student student) {
        boolean studentExist=students.stream().anyMatch(s ->s.getName().equalsIgnoreCase(student.getName()));
        if (!studentExist){
            System.out.println("the student is not found !");return null;

        }
        int orderId= orders.size()+1;
        Order order=new Order(orderId,student);
        orders.add(order);
        System.out.println("order is created successfully ");
        return order;



    }

    @Override
    public void borrowBook(Order order, Books requestedBook, int quantity) {

        if(order==null){
            System.out.println("sorry you cannot borrow the book !");
        }
       boolean bookExist= booksList.stream().anyMatch(book->book.getName().equalsIgnoreCase(requestedBook.getName()));
if (!bookExist){
    System.out.println("the book is not found ! ");
return;
}
if (quantity <=0){
    System.out.println("this quantity is not valid ! ");
}
if (requestedBook.getQuantiy()<quantity){
    System.out.println("it is not enought quantity ! ");
    return;
}
        OrderLine line=new OrderLine(requestedBook,quantity);
orders.add(order);
requestedBook.setQuantiy(requestedBook.getQuantiy()+quantity);
    }

    @Override
    public void returnBook(Order order, Books books) {
if (order==null){
    System.out.println("sorry you cannot return book !");

}else {
    
}
    }

    @Override
    public Books searchOnBook(String bookName) {
        return null;
    }

    @Override
    public void displayOrders() {

    }
}
