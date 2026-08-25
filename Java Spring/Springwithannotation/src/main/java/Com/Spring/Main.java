package Com.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
UserController userController=context.getBean(UserController.class);
userController.save("omar");
userController.update("abdelrahman");
context.close();
    }
}
