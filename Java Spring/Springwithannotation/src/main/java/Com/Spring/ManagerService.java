package Com.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ManagerService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("the manager name has been saved : "+ name);
    }

    @Override
    public void update(String name) {
        System.out.println("the manager name has been updated : "+ name);
    }

}
