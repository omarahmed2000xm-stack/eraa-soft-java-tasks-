public class MaxMin {
  public   int a ;
  public int b ;
  public  int c ;
  MaxMin(int a , int b , int c ){
      this.a=a;
      this.b=b;
      this.c=c;
  }
      void printdata() {
     int max=Math.max(a,Math.max(b,c));
          System.out.println("the maximuim number is :"+max);
          int min=Math.min(a,Math.min(b,c));
          System.out.println(" your minimuim number is :"+min);
      }

  }


