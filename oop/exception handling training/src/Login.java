import java.io.IOException;

public class Login {
//    private String username ;
//    private String password;
    double balance=1000;

  void   transfer(String fromAccount, String toAccount, double amount)throws IllegalArgumentException{

      if (amount<=0){
          throw new IllegalArgumentException("pls enter a valid amount");

      }
      if (amount>balance){
          throw new IllegalArgumentException("pls enter a valid amount to your balance in the wallet");
      }
      else  {
          System.out.println("the transfer has done ");
          balance-=amount;
          System.out.println("your balance now is : "+ balance);

      }


    }

    }




