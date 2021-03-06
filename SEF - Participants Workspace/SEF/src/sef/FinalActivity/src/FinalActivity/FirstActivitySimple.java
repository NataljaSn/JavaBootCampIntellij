package FinalActivity;

public class FirstActivitySimple extends Person{

    public static void main(String[] args) {
        int [] salary = {50, 150, 200};
        int result = salary[2];

        for (int i = 1; i > salary.length; i++) {
            if (salary[i] > result) {
                result = salary[i];
            }
        }
        System.out.println("Largest salary in array is "+result);
        System.out.println("Middle salary in array is "+salary[1]);

        int result1 = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < result1) {
                result1 = salary[i];
            }
        }
        System.out.println("Smallest salary in array is "+result1);


        //previous code is not  automatic, if array size is increased or input values changed result won't be correct anymore.
//        below I tried to write a code so that each name is assigned specific salary (wage), planning to use IFs, to range names by salaries.
//
//    public static void personSample1(String name, int wage) {
//        this.name = name;
//        this.wage = wage;
//
//        personSample1 p1 = new personSample1("John", 50);
//        personSample1 p2 = new personSample1("Sarah", 150);
//        personSample1 p3 = new personSample1("Jane", 250);
//    }
//    System.out.println("This is employee"+p1);
    }
}

//  4.1 create few employees
//  4.2 try to print them from top salary to less
