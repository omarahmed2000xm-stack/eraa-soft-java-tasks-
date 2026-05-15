public class SharedData extends BaseEntity {
    private String phone;

    SharedData(String name,String id,String phone){
        super(name,id);
        this.phone=phone;
    }
    @Override
    void printdata(){
        System.out.println("the name is :"+getName()+ " the id you have entered :"+ getId() +"please enter you phone"+phone);
    }

    public String getPhone() {
        return phone;
    }
}
