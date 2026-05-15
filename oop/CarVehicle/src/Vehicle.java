public class Vehicle {
    private String brand;

    Vehicle(String brand){
        this.brand=brand;

    }
    void printdata(){
        System.out.println("the brand is :"+brand);

    }
    String getBrand(){
        return  brand;
    }
}
