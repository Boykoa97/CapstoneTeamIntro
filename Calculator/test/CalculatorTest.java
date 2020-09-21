import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd(){
//        I will do two tests, 1 add a negative plus a positive and 2 add two positive numbers
        int resultPositives = 15; // adding 5 + 10 should return 15
        int resultMixed = 2; //adding positive 6 with negative 4 should return 2
        Calculator test = new Calculator();
        assertEquals(15, test.add(5,10));
        assertEquals(2, test.add(6,-4));
    }
    @Test
    void testSubtract() {//Ran three tests, one with two positive numbers, one with a positive and a negative, and one with two negatives. 
    	Calculator test = new Calculator();
    	assertEquals(1, test.subtract(4,3));//first test is 4-3, which should give an answer of 1.
        assertEquals(3, test.subtract(1,-2));//second test is 1-(-2), which should give an answer of 3.
        assertEquals(1, test.subtract(-5,-6));//third test is -5-(-6), which should give an answer of 1.
    }
}