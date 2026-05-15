public class Numbers {
     double a;
     double b;

     Numbers(double a ,double b){
         this.a=a;
         this.b=b;
     }

     void res(){
         System.out.println(Math.floor(a/b));
         System.out.println(Math.ceil(a/b));
         System.out.println(Math.round(a/b));
     }


}
