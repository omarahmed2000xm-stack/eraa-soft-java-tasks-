import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player p1 = new Player();
        ClubFc c1 = new ClubFc();
        ClubFcr c2 = new ClubFcr();

        System.out.println("please enter your the name  :");

        String name = scanner.nextLine();


        System.out.println("please enter id ");
        String id = scanner.nextLine();

        System.out.println("please enter your code :");
        String code = scanner.nextLine();

        System.out.println("please enter your number");
        String number = scanner.nextLine();


        p1.setPlayer( name, number, id, code);
        System.out.println("name :" + p1.getName());
        System.out.println("id :" + p1.getId());
        System.out.println("code :" + p1.getCode());
        System.out.println("number :" + p1.getNumber());


        System.out.println("----------------------------------------------");

        System.out.println("please enter your 2nd name  :");

        String   name2 = scanner.nextLine();


        System.out.println("please enter 2nd id ");
        String id2 = scanner.nextLine();

        System.out.println("please enter your 2nd  code  :");
        String code2 = scanner.nextLine();

        System.out.println("please enter your 2nd number : ");
        String number2 = scanner.nextLine();



        c1.setPlayer( name2, number2, id2, code2);
        System.out.println("name :" + c1.getName());
        System.out.println("id :" + c1.getId());
        System.out.println("code :" + c1.getCode());
        System.out.println("number :" + c1.getNumber());



    }
}