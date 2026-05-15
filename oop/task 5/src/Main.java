import java.util.Scanner;
public class Main {
    private static String system;

    public static void main(String[] args){
Scanner scanner=new Scanner(System.in);



        System.out.println("please enter your name :");
        String name=scanner.nextLine();
        System.out.println("please enter your phone :");
        String phone=scanner.nextLine();
        System.out.println("please enter your id :");
        String id=scanner.nextLine();
        System.out.println("please enter your number :");
        String number=scanner.nextLine();

        Player p1=new Player(name ,phone,id,number);
        p1.printdata();
        System.out.println("----------------------------------------------------");

        System.out.println("please enter your name :");
        String pname=scanner.nextLine();
        System.out.println("please enter your phone :");
        String pphone=scanner.nextLine();
        System.out.println("please enter your id :");
        String pid=scanner.nextLine();
        System.out.println("please enter your age :");
        String page=scanner.nextLine();
        Student s1=new Student(pname,pphone,pid,page);
        s1.printdata();

        System.out.println("----------------------------------------------------");

        System.out.println("please enter your name :");
        String sname=scanner.nextLine();
        System.out.println("please enter your phone :");
        String sphone=scanner.nextLine();
        System.out.println("please enter your id :");
        String sid=scanner.nextLine();
        System.out.println("please enter your age :");
        String sage=scanner.nextLine();
        Student p2=new Student(sname,sphone,sid,sage);
        p2.printdata();

    }

}