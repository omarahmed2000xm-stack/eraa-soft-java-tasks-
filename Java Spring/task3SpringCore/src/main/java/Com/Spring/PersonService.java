package Com.Spring;

public class PersonService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("user name saved : "+ name);

    }
    public void init(){
        System.out.println("this is the init method ");
    }
    public void destroy(){
        System.out.println("this is the destroy method ");
    }
}
