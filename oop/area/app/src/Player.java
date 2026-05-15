public class Player {
    private int id;
    private String name;
    private int number;
    void setId(int id){
        if(id>0){
            this.id=id;
        }else {
            System.out.println("enter a valid id ");
        }
    }
    void setNumber(int number){
        if (number<=2) {
            this.number = number;
        }
        else {
            System.out.println("enter a valid number ");
        }
    }
    void setName(String name){
        this.name=name;
    }
    int getId(){
        return id;
    }
    int getNumber(){
        return number;
    }
    String getName(){
        return name;
    }
}
