import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your char : ");
        char a=scanner.next().charAt(0);
        Char c1=new Char(a);
        c1.printdata();

    }
}