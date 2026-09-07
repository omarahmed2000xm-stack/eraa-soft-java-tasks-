package Library.model;

public class Librarian extends  Person {
    public Librarian(String name, int id, String password, int age) {
        super(name, id, password, age);
    }




    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public double getAge() {
        return super.getAge();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
    @Override
    public void displayInfo() {
        System.out.println("name : " +getName());
        System.out.println("id : "+getId());
        System.out.println("age : "+getAge());
    }
}
