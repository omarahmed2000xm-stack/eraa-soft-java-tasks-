package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public  static void main ( String[] args){
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService1=context.getBean("personService",PersonService.class);
        PersonService personService2=context.getBean("personService",PersonService.class);
        System.out.println(personService1==personService2);
        context.close();


    }
}
