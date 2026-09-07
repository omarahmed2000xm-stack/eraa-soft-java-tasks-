package Di;

public class SmsNotficationService implements NotficationService{
    @Override
    public void send(String message) {
        System.out.println("Your sms: "+ message);
    }
}
