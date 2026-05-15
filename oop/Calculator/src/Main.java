import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" please enter the value of a : ");
        double a= scanner.nextDouble();
        System.out.println( "please enter the value of b : ");
        double b= scanner.nextDouble();
        System.out.println( " please enter  your operation typer : ");
        scanner.nextLine();
        String c= scanner.nextLine();
        System.out.println(" a : "+a);
        System.out.println( " operator is :"+c);
        System.out.println(" b is : "+b);
        Calculator c1= new Calculator(a,b,c);
        c1.printdata();

    }
}