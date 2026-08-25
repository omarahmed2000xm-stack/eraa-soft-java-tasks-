package Com.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AccountServiceImpl implements UserService{
    @Override
    public void save(String name) {
        System.out.println("save account service impl "+name);
    }

    @Override
    public void update(String name) {
        System.out.println("update account service impl"+ name);
    }
}
