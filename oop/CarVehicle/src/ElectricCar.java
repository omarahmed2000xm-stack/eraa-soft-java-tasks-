public class ElectricCar extends Car {
    private String batterycapacity;
    ElectricCar(String brand,String model,String batterycapacity){
        super(brand,model);
        this.batterycapacity=batterycapacity;

    }
    @Override
    void printdata(){
        System.out.println("model :"+ getModel() +" brand :"+ getBrand() +" battery capacity :"+batterycapacity);
    }




    public String getBatterycapacity() {
        return batterycapacity;
    }
}
