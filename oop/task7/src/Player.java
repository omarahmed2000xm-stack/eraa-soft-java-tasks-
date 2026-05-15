public class Player {
    private String name;
    private String id ;
    private String number;
    private String code;

void setPlayer(String name, String id,String number,String code){
this.name=name;
this.id=id;
this.number=number;
this.code=code;
}
String getName(){
    return  name;
}
String getId(){
    return  id;
}
String getNumber(){
    return number;
}
String getCode(){
    return code;
}
}

