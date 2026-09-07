package Di;

public class UserManager {
    NotficationService notficationService;
    public UserManager (NotficationService notficationService){
        this.notficationService=notficationService;
    }
    public void notifyUser(String message){
notficationService.send(message);
    }
}
