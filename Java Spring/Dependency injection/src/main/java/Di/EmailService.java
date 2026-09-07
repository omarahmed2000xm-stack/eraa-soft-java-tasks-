package Di;

public class EmailService implements NotficationService{
    @Override
    public void send(String message) {
        System.out.println("Email sent : "+message);
    }
}
