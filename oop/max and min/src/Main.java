import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your first number   : ");
        int a= scanner.nextInt();
        System.out.println("please enter your 2nd number : ");
        int b= scanner.nextInt();
        System.out.println("please enter your 3rd number :");
        int c= scanner.nextInt();
        MaxMin m1=new MaxMin(a,b,c);
        m1.printdata();
    }
}