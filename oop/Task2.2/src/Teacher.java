public class Teacher {
    private long id;
    private String name;
    private float age;
    private String phonenumber;
    private float salary;
      void setId(long id){
          if (id > 0){
              this.id=id;
          }else {
              System.out.println("enter a valid id ");}
      }
      void setName(String name){
          if (name.length()>=3 && name.matches("[a-z]+")){
              this.name=name;
          }else {
              System.out.println("enter a valid name");
          }
      }
      void  setAge(float age){
          if (age >= 25 && age>=60){
              this.age=age;
          }else {
              System.out.println("enter a valid age");
          }
      }
      void setPhonenumber(String phonenumber){
          if (phonenumber.startsWith("+20")&&phonenumber.length()==13){
              this.phonenumber=phonenumber;
          }else {
              System.out.println("enter a valid phone number");
          }
      }
      void setSalary(float salary){
          if (salary >= 3000){
              this.salary=salary;
          }
          else {
              System.out.println("please enter a valid salary");
          }
      }
      long getId(){
          return id;
      }
      String getName(){
          return name;
      }
      float getAge(){
          return age;
      }
      String getPhonenumber(){
          return phonenumber;
      }
      float getSalary(){
          return salary;
      }
}
