//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
Mobile m1=new Mobile("samsung",10000);
        System.out.println(m1.getBrand());
        System.out.println(m1.getPrice());
        m1.setPrice(100);
        System.out.println(m1.getPrice());
    }
}
