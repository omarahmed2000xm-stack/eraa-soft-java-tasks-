import java.io.IOException;

public class Main {
    public static void main(String[] args){

Login signIn=new Login();
try {
    signIn.transfer("ahmed","ali",100);
}catch (Exception e ){
    System.out.println(e.getMessage());
}






    }
}