public class Students {
    String name;
    int id ;
    String room;
    Students(String name ,int id ,String room){
        this.name=name;
        this.id=id;
        this.room=room;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "name  :"+name+"  "+
         "id :"+ id;

    }
    void printData(){
        System.out.println(name);
        System.out.println(id );
    }
}
