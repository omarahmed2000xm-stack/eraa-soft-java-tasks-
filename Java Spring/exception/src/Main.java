public class Main {
    public static void main ( String[] args){

Account acc=new Account();
acc.name="omar";
acc.balance=1500;



Account acc2=new Account();
acc2.name="ali";
acc2.balance=2343;
try {
    acc.transfer(acc,acc2,-10000);
}
catch (IllegalArgumentException e ){
    System.out.println("enter a valid amount");

}

    }
}