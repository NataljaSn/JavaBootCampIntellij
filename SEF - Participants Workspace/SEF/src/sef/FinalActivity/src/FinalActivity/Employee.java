package FinalActivity;

public class Employee extends Person{

    //Attributes
    private static String job;
    private static String company;

    //constructor
    public Employee (String job, String company){
        this.job = job;
        this.company = company;
    }
    // getter for String name
    public String getJob() {
        return job;
    }
    // setter for String name
    public void setJob(String job) {
        this.job = job;
    }
    // getter for String name
    public String getCompany() {
        return company;
    }
    // setter for String name
    public void setCompany(String company) {
        this.company = company;
    }

    public static void main(String[] args) {
                Person p = new Person();
        p.setName("Ivan Ivanov");
        p.setAge(30);
        System.out.println("My name is " +name + "! And I am " +age +" years old.");

        job = "tester";
        company = "ABC";
        System.out.println("I work as " +job + " in company " +company +".");
           }

}



//*  2) In file Employee
////                2.1 Add different constructors
////                2.2 Add getters and setters
////                2.3 Add method for introduce of person ->
////                "My name is <name> and i am <age> years old
////                 I am work as <jobTitle> in <company>"