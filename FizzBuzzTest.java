import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void whenMultipleOfThreeThenReturnFizz() {
        assertEquals("Fizz", FizzBuzz.calculate(3));
        assertEquals("Fizz", FizzBuzz.calculate(6));
        assertEquals("Fizz", FizzBuzz.calculate(9));
        //A number is a multiple of ‘3’ return “Fizz”
        // Add more cases if necessary
    }
    @Test
    public void whenMultipleOfFiveThenReturnBuzz() {
        assertEquals("Buzz", FizzBuzz.calculate(5));
        assertEquals("Buzz", FizzBuzz.calculate(10));
        assertEquals("Buzz", FizzBuzz.calculate(20));
        //A number is a multiple of ‘5’ return “Buzz”
        // Add more cases if necessary
    }
    @Test
    public void whenMultipleOfBothThreeAndFiveThenReturnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.calculate(15));
        assertEquals("FizzBuzz", FizzBuzz.calculate(30));
        assertEquals("FizzBuzz", FizzBuzz.calculate(45));
        //A number is a multiple of both ‘3’ and ‘5’ return “FizzBuzz”
        // Add more cases if necessary
    }
    @Test
    public void whenNotMultipleOfThreeOrFiveThenReturnNumber() {
        assertEquals("1", FizzBuzz.calculate(1));
        assertEquals("2", FizzBuzz.calculate(2));
        // A number is not divisible by ‘3’ or ‘5’ return the number itself (as a String)
        // Add more cases if necessary

    }


}
