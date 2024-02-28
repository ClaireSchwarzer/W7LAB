import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testNumberOneReturnsStringOne() {
        assertEquals("1", FizzBuzz.calculate(1));
    }
}
