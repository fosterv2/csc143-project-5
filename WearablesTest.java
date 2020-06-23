import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WearablesTest.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class WearablesTest {
    
    Wearables wearTest;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        wearTest = new Wearables();
    }

    @Test
    public void testGetDataByRank() {
        int[] rankArr = wearTest.getDataByRank();
        // proves all of the data was read from the file:
        assertEquals(582, rankArr.length);
        // proves the data is oganized by ranking:
        assertEquals(0, rankArr[547]);
        assertEquals(1, rankArr[218]);
    }
    
    @Test
    public void testGetDataByPrice() {
        int[] priceArr = wearTest.getDataByPrice();
        // The wearable at index 60 is the first with -99.99 price, so it should be at the beginning
        assertEquals(58, priceArr[0]);
    }
    
    @Test
    public void testGetDataByComp() {
        int[] compArr = wearTest.getDataByCompany();
        // the wearable at index 59 is 180s, and likely at the beginning of the company names alphabetically
        assertEquals(59, compArr[0]);
    }
    
}
