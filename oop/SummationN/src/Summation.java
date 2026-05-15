public class Summation {
    public long n;
    Summation(long num){
        this.n=num;
    }
    void rule(){
        if(n<Math.pow(10,9)) {
            System.out.println(n * (n + 1) / 2);
        }
        else {
            System.out.println("please enter number less than MATH.pow(10,9)");
        }
    }
}
