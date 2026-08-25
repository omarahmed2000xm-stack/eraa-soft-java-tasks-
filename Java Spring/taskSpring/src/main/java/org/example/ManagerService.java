package org.example;

public class ManagerService implements  UserService{
    @Override
    public void save(String name) {
        System.out.println("save manager name : "+ name);
    }

    @Override
    public void update(String name) {
        System.out.println("update manager name : "+ name);
    }
}
