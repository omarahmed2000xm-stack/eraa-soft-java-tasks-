public class Student extends Person {
    private int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;

    }

    int getGrade() {
        return grade;
    }

    void study() {
        System.out.println("student " + getName() + " is studying in" + grade);
    }

    @Override
    void introduce() {
        System.out.println("Hi my name " + getName() + "and my grade is " + grade);
    }
}
