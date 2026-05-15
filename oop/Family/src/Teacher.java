public class Teacher extends Person{
    private String subject;

    Teacher(String name,int age,String subject)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             {
       super(name,age);
        this.subject=subject;

    }
    void teach(){
        System.out.println("hello my name "+getName()+" and i am teaching"+subject);
    }
    @Override
    void introduce(){
        System.out.println(" hello  i am "+getName()+"and i am teach "+subject);
    }

}
