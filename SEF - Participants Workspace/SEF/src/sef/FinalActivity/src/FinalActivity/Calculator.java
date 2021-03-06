package FinalActivity;

public class Calculator {
    public static void main(String[] args) {

        int x = 8;
        int y = 3;

        System.out.println("Addition : " + add(x,y));
        System.out.println("Subtraction : " + subtract(x,y));
        System.out.println("Multiply : " + multiply(x,y));
        System.out.println("Divide : " + divide(x,y));
    }


    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int subtract(int x, int y) {
        int diff = x- y;
//        if (x > y) {
//            diff = x - y;
//            return diff;
//        } else {
//            diff = y - x;
//        }
        return diff;
    }

    public static int multiply(int x, int y) {
        int temp = x * y;
        return temp;
    }

    public static int divide(int x, int y) {
        int divValue = 0;

        if (x == 0 || y == 0) {
            divValue = 0;
            System.out.println("Divide by zero impossible! ");
        } else {
            divValue = x/y;
        }
        return divValue;
            }

}

