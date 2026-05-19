public class Account {
    String name;
    double balance;
   void transfer(Account from,Account to,double amount)throws IllegalArgumentException {

       if (from==to){
           throw new IllegalArgumentException("your sending to the same account");
       }
       if (amount>balance){
           throw  new IllegalArgumentException("enter a valid amount  to your balance ) ");
       }
       if (amount<=0){
           throw new IllegalArgumentException("pls enter a valid number !");
       }
       else {
           System.out.println("the transaction has done ");
          from.balance-=amount;
          to.balance+=amount;
           System.out.println("you balance is : "+from.balance);
       }
   }
}
