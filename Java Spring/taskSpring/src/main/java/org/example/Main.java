package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService=context.getBean("PersonService",PersonService.class);
        ManagerService managerService=context.getBean("ManagerService", ManagerService.class);

        personService.save("Ali");
        personService.update("mohaemd");
        managerService.save("abdallah");
        managerService.update("java");
    }
}
