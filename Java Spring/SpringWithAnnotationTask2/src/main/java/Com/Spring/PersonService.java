package Com.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PersonService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("has saved the person name "+name);
    }

    @Override
    public void update(String name) {
        System.out.println("person has name updated "+name);
    }
}
