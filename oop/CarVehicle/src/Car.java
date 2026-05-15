public class Car extends Vehicle {
    private String model;

    Car(String brand,String model){
        super(brand);
        this.model=model;

    }
    @Override
    void printdata(){
        System.out.println("the brand is :"+getBrand()+" the model is :"+model);
    }

    public String getModel() {
        return model;
    }
}
