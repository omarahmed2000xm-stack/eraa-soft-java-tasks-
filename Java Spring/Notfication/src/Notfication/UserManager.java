package Notfication;

public class UserManager {
    NotficationService notficationService;
    public UserManager(NotficationService notficationService){
        System.out.println("creating manager ");
        this.notficationService=notficationService;
    }
    public void registerUser(String userName){
        System.out.println("username is : "+userName);
        notficationService.sendNotification("welcome : "+userName);
    }


}
