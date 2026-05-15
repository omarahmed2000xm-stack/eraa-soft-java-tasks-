public class student {
    String name;
    String id;
    int age;
    student(String name,String id,int age){
        this.name=name;
        this.id=id;
        this.age=age;

    }

    void printdata(){
        System.out.println("your name is :"+name);
        System.out.println("id :"+id);
        System.out.println("age :"+age);

    }
}
