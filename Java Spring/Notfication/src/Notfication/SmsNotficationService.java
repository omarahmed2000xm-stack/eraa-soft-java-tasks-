package Notfication;

public class SmsNotficationService implements NotficationService{
    NotficationService  notficationService;
    public SmsNotficationService(NotficationService notficationService){
        this.notficationService=notficationService;
    }

    @Override
    public void sendNotification(String message) {

    }
}
