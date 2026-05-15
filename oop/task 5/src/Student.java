public class Student extends SharedData {
    private String age;

    Student(String name, String id, String age, String phone) {
        super(name, id, phone);
        this.age = age;
    }

    @Override
    void printdata(){
        System.out.println("the name is :"+getName()+ " the id you have entered :"+getId()+"the number is :"+getId()+"the age is :"+age);
    }
}