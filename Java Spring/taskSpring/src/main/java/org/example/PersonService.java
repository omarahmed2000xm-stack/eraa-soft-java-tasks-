package org.example;

public class PersonService implements UserService{



    @Override
    public void save(String name) {
        System.out.println("save the persone name is : "+name);
    }

    @Override
    public void update(String name) {
        System.out.println("update the persone name is : "+ name);
    }
}
