package FinalActivity;

import junit.framework.TestCase;

public class TryCatchBlock extends TestCase {

    public static void main(String[] args) {
        int x;
        int y;
        x = 5;
        y = 2;
           }
    public TryCatchBlock(int x, int y){
        System.out.println("Division result : " + TryCatchBlock(x,y));
        int TryCatchBlock = x / y;

        try
        {
            int div = x / y;
            System.out.println("Division result : " +div);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Division by zero not possible!");
        }

    }

}

