public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void introduce() {
        System.out.println("hey my" + name + " and i am" + age + " years old");
    }
}
