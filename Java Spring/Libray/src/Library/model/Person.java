package Library.model;

public class Person {
   private String name ;
   private int id ;
   private String password;
   private int  age;

    public Person(String name, int id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void displayInfo(){
        System.out.println("name  :"+name);
        System.out.println("id : "+id );
        System.out.println("age "+age);
    }
}
