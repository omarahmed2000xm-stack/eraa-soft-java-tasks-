public class Brothers {
    public String firstName1;
    public String firstName2;
    public String secondName1;
    public String secondName2;

    Brothers(String firstName1,String firstName2,String secondName1, String secondName2){
        this.firstName1=firstName1;
        this.firstName2=firstName2;
        this.secondName1=secondName1;
        this.secondName2=secondName2;

    }
    void printdata(){
        if (secondName1.equals(secondName2)){
            System.out.println("they are brothers !");
        }
        else {
            System.out.println("they are not brothers !");
        }
    }
}
