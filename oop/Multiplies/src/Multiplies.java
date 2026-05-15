public class Multiplies {
    double a ;
    double b ;
    Multiplies(double a ,double b){
        this.a=a;
        this.b=b;
    }
    void  MyMultiplies(){
        if (a % b==0 && b%a==0 ){
            System.out.println("Multiplies");
        }
        else {
            System.out.println("no multiplies");
        }
    }
}
