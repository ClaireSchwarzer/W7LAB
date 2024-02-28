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

}
