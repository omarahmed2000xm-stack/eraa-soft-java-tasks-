public class simpleCalculator {
    int x;
    int y;
    simpleCalculator(int x,int y){
        this.x=x;
        this.y=y;
    }
    void printdata(){
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
    }
}
