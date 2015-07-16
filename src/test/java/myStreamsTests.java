import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ssavanu on 7/15/2015.
 */
public class myStreamsTests {

    @Test
    public void whenStreamHasRangeOneToTwo() {
        String expResult[] = new String[]{"1","2"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 2));
    }

    @Test
    public void whenStreamHasRangeOneToFour() {
        String expResult[] = new String[]{"1","2","Fizz","4"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 4));
    }

    @Test
    public void whenStreamHasRangeOneToFive() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 5));
    }

    @Test
    public void whenStreamHasRangeOneToSix() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz", "Fizz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 6));
    }

    @Test
    public void whenStreamHasRangeOneToNine() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz", "Fizz","7","8","Fizz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 9));
    }

    @Test
    public void whenStreamHasRangeOneToTen() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz", "Fizz","7","8","Fizz", "Buzz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 10));
    }

    @Test
    public void whenStreamHasRangeOneToTwelve() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz", "Fizz","7","8","Fizz", "Buzz", "11", "Fizz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 12));
    }

    @Test
    public void whenStreamHasRangeOneToFifteen() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz", "Fizz","7","8","Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 15));
    }

    @Test
    public void whenStreamHasRangeOneToTwenty() {
        String expResult[] = new String[]{"1","2","Fizz","4", "Buzz", "Fizz","7","8","Fizz", "Buzz", "11",
                                            "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        List expectedResult = Arrays.asList(expResult);
        assertEquals(expectedResult, myStreams.generateFizzBuzz(1, 20));
    }

    @Test
    public void whenStreamHasNumberThree() {
        String expResult = "Fizz";
        assertEquals(expResult, myStreams.generateFizzBuzz(3));
    }

    @Test
    public void whenStreamHasNumberFive() {
        String expResult = "Buzz";
        assertEquals(expResult, myStreams.generateFizzBuzz(5));
    }

    @Test
    public void whenStreamHasNumberSix() {
        String expResult = "Fizz";
        assertEquals(expResult, myStreams.generateFizzBuzz(6));
    }

    @Test
    public void whenStreamHasNumberNine() {
        String expResult = "Fizz";
        assertEquals(expResult, myStreams.generateFizzBuzz(9));
    }

    @Test
    public void whenStreamHasNumberTen() {
        String expResult = "Buzz";
        assertEquals(expResult, myStreams.generateFizzBuzz(10));
    }

    @Test
    public void whenStreamHasNumberTwelve() {
        String expResult = "Fizz";
        assertEquals(expResult, myStreams.generateFizzBuzz(12));
    }

    @Test
    public void whenStreamHasNumberFifteen() {
        String expResult = "FizzBuzz";
        assertEquals(expResult, myStreams.generateFizzBuzz(15));
    }
}
