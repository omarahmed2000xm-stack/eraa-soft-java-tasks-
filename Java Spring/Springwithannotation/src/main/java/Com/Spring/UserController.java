package Com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class UserController {

    UserService  userService;
    public UserController( @Qualifier("personService") UserService userService){
        this.userService=userService;
    }
    public void save(String name) {
        userService.save(name);
    }

    public void update(String name) {
        userService.update(name);
    }
}
