package Com.Spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("singleton")
@Component
public class PersonService implements UserService{
@PostConstruct
    public void init (){
        System.out.println("the name has been created ");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("the pesron name is destroyed successfully");
    }
    @Override
    public void save(String name) {
        System.out.println("the name of the person is completely saved : "+ name);
    }

    @Override
    public void update(String name) {
        System.out.println("the name of the person is updated : " + name);
    }
}
