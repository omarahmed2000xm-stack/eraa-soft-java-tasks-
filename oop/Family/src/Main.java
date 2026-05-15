public class Main {
    public static void main(String[] args){
Person p1=new Person("ahmed",19);
Student s1=new Student("omar",19,8);
Teacher t1=new Teacher("mohamed",45,"math");

        p1.introduce();
        s1.study();
        s1.introduce();
        t1.teach();
        t1.introduce();


    }
}
