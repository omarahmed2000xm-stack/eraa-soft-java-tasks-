import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a :");
    double a= scanner.nextDouble();
        System.out.println("please enter your b :");
        double b = scanner.nextDouble();
        Multiplies m1=new Multiplies(a,b);
        m1.MyMultiplies();
    }
}
