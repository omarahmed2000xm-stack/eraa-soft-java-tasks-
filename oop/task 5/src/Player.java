public class Player extends SharedData{
    private String number;
    Player(String name,String phone,String id ,String number){
        super(name,phone,id);
        this.number=number;
    }
    @Override
    void printdata(){
        System.out.println("the name is :"+getName()+ " the id you have entered :"+getId()+"the phone is :"+getPhone()+"the number is :"+number);
    }
}
