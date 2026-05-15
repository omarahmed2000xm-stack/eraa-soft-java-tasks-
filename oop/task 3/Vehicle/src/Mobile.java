public class Mobile {
    private String brand;
    private int price;
    Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;

    }
    String getBrand(){
       return brand;
    }
    int getPrice(){
       return price;
    }
    void setPrice(int price){
        if (price<=1000){
            System.out.println("price too low");
        }
        else {
            this.price=price;
        }
    }
}