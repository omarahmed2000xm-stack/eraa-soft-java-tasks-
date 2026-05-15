public class teacher {
    public int id=1;

    public String name ="ahmed";
    public int age=19;
  private  boolean userSecret= true;
    void myFunction(int id,String name,int age){
        if(name == "ahmed" && age==19&&id == 1){
            System.out.println(name+age+id);
        }
        else{
            System.out.println("enter a valid data");
        }


    }
}
