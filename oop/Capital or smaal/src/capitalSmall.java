public class capitalSmall {
    public char a;

    capitalSmall(char a) {
        this.a = a;

    }

    void printdata() {

        if (a >= '0' && a <= '9') {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
        }
        if (a >= 'A' && a <= 'Z') {
            System.out.println("IS CAPITAL");
        } else {
            System.out.println("IS SMALL");
        }


    }
}