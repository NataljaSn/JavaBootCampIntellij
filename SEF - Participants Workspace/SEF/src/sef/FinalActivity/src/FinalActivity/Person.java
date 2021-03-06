package FinalActivity;

public class Person {

    //1.1 Based on code implement Person attributes
    public static String name;
    public static int age;

    //default constructor:
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    //parameterized constructor:
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be less than zero!");
        }
    }

    //*  1.2 Add method for introduce of person ->
////                 "My name is <name> and i am <age> years old"
    public static void main(String[] args) {
        name = "Janis Ozols";
        age = 25;
        System.out.println("My name is " + name + "! And I am " + age + "years old.");
    }


}


