package Library.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
private int orderId;
private List<OrderLine>orderLines;
private Student student ;
private LocalDateTime localDateTime;


public Order(int orderId,Student student){
    this.orderId=orderId;
    this.student=student;
    this.localDateTime=localDateTime.now();
    this.orderLines=new ArrayList<>();

}
public void addLine( OrderLine Lines){
   this.orderLines.add(Lines);


}
    public void displayOrder() {

        System.out.println("========================================");
        System.out.println("           E-LIBRARY RECEIPT");
        System.out.println("========================================");

        System.out.println("Order ID : " + orderId);
        System.out.println("Student ID : " + student.getId());
        System.out.println("Student Name : " + student.getName());
        System.out.println("Order Date : " + localDateTime);

        System.out.println("----------------------------------------");
        System.out.println("Books");
        System.out.println("----------------------------------------");

        for (OrderLine orderLine : orderLines) {
            orderLine.displayInfo();
        }

        System.out.println("----------------------------------------");
        System.out.println("Order Total : " + getOrderTotal());
        System.out.println("========================================");

    }
public double  getOrderTotal(){
   double total=0;
   for (OrderLine orderLine: orderLines){total+=orderLine.getSubTotal();}

   return total;

}




}
