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
}