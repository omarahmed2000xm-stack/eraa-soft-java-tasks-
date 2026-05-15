import java.util.Scanner;
public class Main {
    public static void main(String[] args){
Sum s1=new Sum();

Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your 1st number:");
        double num1=scanner.nextDouble();
        System.out.println("please enter your 2nd number :");
        double num2=scanner.nextDouble();
        System.out.println("please enter your 3rd no :");
        double num3=scanner.nextDouble();
        s1.setNum(num1,num2,num3);
        System.out.println(s1.getNum());
    }
}

