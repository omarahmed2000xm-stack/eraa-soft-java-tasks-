public class dataType {
    long x;
    long y;
    char z;
    double f;
    double h;
    dataType(long x,long y,char z,double f,double h){
        this.x=x;
        this.y=y;
        this.z=z;
        this.f=f;
        this.h=h;
    }
    void printdata(){
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z :"+z);
        System.out.println("f:"+f);
        System.out.println("h :"+h);
    }
}
