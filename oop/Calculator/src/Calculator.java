public class Calculator {
    public double a ;
    public double b ;
    public String c ;
    Calculator(double a ,double b,String c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void printdata(){
        if (c.equals("+")){
            System.out.println(a+b);
            
        } else if (c.equals("-")) {
            System.out.println(a-b);
            
        } else if (c.equals("*")) {
            System.out.println(a*b);
            
        }
        else if (c.equals("/")){
            System.out.println(a/b);
        }
        else {
            System.out.println(" it is not a valid operator in this calculator  , please try again");
        }
    }
    
}
