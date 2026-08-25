package Com.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserController {
    UserService userService;
    public UserController(@Qualifier ("accountServiceImpl") UserService userService){
        this.userService=userService;
    }
    void save(String name ){
userService.save(name);
    };
    void update(String name){
        userService.update(name);
    };
}
