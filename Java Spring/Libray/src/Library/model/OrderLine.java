package Library.model;

public class OrderLine {
    private  Student student;
    private Books books;
    private int quantity;
    private  double vat=0.14;

    public OrderLine(Books books,int quantity,Student student){

        this.books=books;
        this.quantity=quantity;
        this.student=student;
    }
    public OrderLine(Books books,int quantity){
        this.books=books;
        this.quantity=quantity;
    }

    public Student getStudent() {
        return student;
    }

    public Books getBooks() {
        return books;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getVat() {
        return vat;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }


    public void displayInfo() {
//        System.out.println("name : "+student.getName());
//        System.out.println("id: "+student.getId());
//        System.out.println("age : "+student.getAge());
        System.out.println("book : "+books.getName() + quantity+"==Quantity ");

    }

    public double getSubTotal(){
       return getBooks().getPrice()*getQuantity();
    }
    public double getVatAmount(){
        return getSubTotal()*getVat();
    }
    public double getLineTotal(){
        return getSubTotal()+getVatAmount();
    }
    public void processOrder(){
        System.out.println("subtotal is : " +  getSubTotal());
        System.out.println("Vat amount : " + getVatAmount());
        System.out.println("Total is : "+ getLineTotal());
    }
}
