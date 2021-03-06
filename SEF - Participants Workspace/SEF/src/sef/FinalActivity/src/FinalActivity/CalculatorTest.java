package FinalActivity;

import junit.framework.TestCase;
import org.junit.Test;


public class CalculatorTest extends TestCase{
    private Calculator theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAdd() {

        int x = 5;
        int y = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (theCalculator.add(x,y)));
        assertEquals(15, (theCalculator.add(y,x)));

        x = -5;
        y = 10;
        //	Checks the sum of a positive value and a negative value
        assertEquals(5, (theCalculator.add(x,y)));
        assertEquals(5, (theCalculator.add(y,x)));

        x = -5;
        y = -10;
        //	Checks the sum of two (2) negative values
        assertEquals(-15, (theCalculator.add(x,y)));
        assertEquals(-15, (theCalculator.add(y,x)));
    }
    public void testSubtract() {

        int x = 3;
        int y = 2;
        //	Checks if y is lesser than a
        assertEquals(1, (theCalculator.subtract(x,y)));
        //	Checks if b is greater than a
        assertEquals(-1, (theCalculator.subtract(y,x)));

        x = 5;
        y = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(9, (theCalculator.subtract(x,y)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-9, (theCalculator.subtract(y,x)));

        x = -10;
        y = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (theCalculator.subtract(x,y)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (theCalculator.subtract(y,x)));
    }
    public void testMultiply() {

        int x = 5;
        int y = 10;
        //	Checks the product of two (2) positive values
        assertEquals(50, (theCalculator.multiply(x,y)),0);
        assertEquals(50, (theCalculator.multiply(y,x)),0);

        x = -5;
        y = 10;
        //	Checks the product of a postive value and a negative value
        assertEquals(-50, (theCalculator.multiply(x,y)),0);
        assertEquals(-50, (theCalculator.multiply(y,x)),0);

        x = -3;
        y = -10;
        //	Checks the product of two (2) negative values
        assertEquals(30, (theCalculator.multiply(x,y)),0);
        assertEquals(30, (theCalculator.multiply(y,x)),0);
    }
    public void testDivide() {

        int x = 10;	int y = 5;
        //	Checks if b is lesser than a
        assertEquals(2, (theCalculator.divide(x,y)),0);
        //	Checks if b is greater than a
        assertEquals(0, (theCalculator.divide(y,x)),0);

        x = 9;	y = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (theCalculator.divide(x,y)),0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0, (theCalculator.divide(y,x)),0.007);

        x = -10;	y = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (theCalculator.divide(x,y)),0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0, (theCalculator.divide(y,x)),0);
    }

    public void testThrowException(){

        try {

            theCalculator.add(2, 1);
            theCalculator.subtract(3, 3);
            theCalculator.multiply(0, 1);
            theCalculator.divide(1, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }
}
