public class Condition {
    public int a ;
    public int b ;
    boolean c;
    Condition(int a , int b){
        this.a=a;
        this.b=b;
    }
    String printdata(){
  if (a>=b){
      return "yes";
  }
  else {
      return "no";
  }
        }


}
