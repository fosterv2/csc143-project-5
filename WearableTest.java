import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WearableTest.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class WearableTest {
    
    @Test
    public void testConstructor() {
        Wearable wearTest = new Wearable(1, 548, "Fitness Watch", 49.99, "Wrist", "Fitness", "Barska", "http://barska.com",
                                            "Pomona, California, United States", "Pomona", "California", "United States");
        assertEquals(1, wearTest.getIndex());
        assertEquals(548, wearTest.getRank());
        assertEquals("Fitness Watch", wearTest.getName());
        assertEquals(49.99, wearTest.getPrice(), 0.001);
        assertEquals("Wrist", wearTest.getBodyLocation());
        assertEquals("Fitness", wearTest.getCategory());
        assertEquals("Barska", wearTest.getCompName());
        assertEquals("http://barska.com", wearTest.getCompURL());
        assertEquals("Pomona, California, United States", wearTest.getCompAddress());
        assertEquals("Pomona", wearTest.getCompCity());
        assertEquals("California", wearTest.getCompState());
        assertEquals("United States", wearTest.getCompCountry());
    }
}
