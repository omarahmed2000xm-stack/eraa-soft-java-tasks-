package Notfication;

public class EmailSendNotficationService implements  NotficationService{
    NotficationService notficationService;
    public EmailSendNotficationService(NotficationService notficationService){
        this.notficationService=notficationService;
    }

    @Override
    public void sendNotification(String message) {

    }
}
