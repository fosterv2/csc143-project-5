import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KAryTreeTest.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class KAryTreeTest {
    
    KAryTree<Integer> treeTest;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        treeTest = new KAryTree<Integer>();
        Integer int1 = 14;
        Integer int2 = 2;
        Integer int3 = 56;
        Integer int4 = 21;
        Integer int5 = 63;
        Integer int6 = 14;
        Integer int7 = 14;
        treeTest.add(int1, 1);
        treeTest.add(int2, 2);
        treeTest.add(int3, 3);
        treeTest.add(int4, 4);
        treeTest.add(int5, 5);
        treeTest.add(int6, 6);
        treeTest.add(int7, 7);
    }

    @Test
    public void testBasics() {
        assertEquals(7, treeTest.getSize());
    }
    
    @Test
    public void testGetPosData() {
        int[] orderArr = treeTest.getPosData();
        assertEquals(2, orderArr[0]);
        assertEquals(1, orderArr[1]);
        assertEquals(6, orderArr[2]);
        assertEquals(7, orderArr[3]);
        assertEquals(4, orderArr[4]);
        assertEquals(3, orderArr[5]);
        assertEquals(5, orderArr[6]);
    }
    
}
