public class BaseEntity {
    private String name;
    private String id;

    BaseEntity(String name,String id){
        this.name=name;
        this.id=id;
    }
    void printdata(){
        System.out.println("the name is :"+name+ " the id you have entered :"+id);
    }
    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
}
