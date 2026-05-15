public class Char {
    public char a;

    Char (char a){
        this.a=a;

    }
    void printdata(){
        if (a >= 'a'&&a<='z'){
            a=(char)(a-32);

        }
        else {
            a=(char)(a+32);
        }
        System.out.println(a);
    }
}
