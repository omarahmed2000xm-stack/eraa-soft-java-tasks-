public class Student extends Player {
    private int age;

    void setAge(int age){
        if (age>7&&age<30) {
            this.age = age;
        }
    }
    int getAge(){
        return age;
    }
}
