import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your first name :");
        String firstName1=scanner.nextLine();
        System.out.println("please enter your 2nd name  :");
        String firstName2= scanner.nextLine();
        System.out.println("please enter your first name :");
        String secondName1= scanner.nextLine();
        System.out.println("please enter your 2nd name :");
        String secondName2=scanner.nextLine();

        System.out.println( " the first person name : "+firstName1+secondName1);
        System.out.println("the 2nd person name is :"+firstName2+secondName2);
        Brothers b1=new Brothers(firstName1,firstName2,secondName1,secondName2);
        b1.printdata();
    }
}
