import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your character :");
        char a=scanner.next().charAt(0);
        capitalSmall c1=new capitalSmall(a);
        c1.printdata();


    }
}