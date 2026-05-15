import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a ");
        double a= scanner.nextDouble();
        System.out.println("please enter b");
        double b= scanner.nextDouble();
        Numbers n1=new Numbers(a,b);
        n1.res();
    }
}