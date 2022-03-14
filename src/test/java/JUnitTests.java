import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTests {

    @Test
    public void testIfNameIsJason() {
        String expected = "Jason";
        String actual = "Jason";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.0, price-discount, .5);
        assertNotEquals(4.2,price-discount, .5);

    }
}