import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testNumberOneReturnsStringOne() {
        assertEquals("1", FizzBuzz.calculate(1));
    }
    @Test
    public void whenMultipleOfThreeThenReturnFizz() {
        assertEquals("Fizz", FizzBuzz.calculate(3));
        assertEquals("Fizz", FizzBuzz.calculate(6));
        assertEquals("Fizz", FizzBuzz.calculate(9));
    }
    @Test
    public void whenMultipleOfFiveThenReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.calculate(5));
        assertEquals("Buzz", FizzBuzz.calculate(10));
        assertEquals("Buzz", FizzBuzz.calculate(20));
    }

}
