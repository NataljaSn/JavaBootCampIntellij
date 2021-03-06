package FinalActivity;
// this file is for task #4 and includes Employee names & salaries
public class address {


    int id;
    String street;
    String postcode;
    String name;
    int salary;

    public address(int id, String street, String postcode, String name, int salary){
        this.id = id;
        this.street = street;
        this.postcode = postcode;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

