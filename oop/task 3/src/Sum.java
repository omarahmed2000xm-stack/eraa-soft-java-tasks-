public class Sum {
    private double num1;
    private double num2;
    private double num3;


    void setNum(double num1, double num2, double num3) {
        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {


            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;

        } else {
            System.out.println("please enter a valid number");
        }
    }

    double getNum() {
        return num1 + num2 + num3;

    }


}
