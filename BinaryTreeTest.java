import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinaryTreeTest.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class BinaryTreeTest{
    
    BinaryTree<Integer> treeTest;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        treeTest = new BinaryTree<Integer>();
        Integer int1 = 14;
        Integer int2 = 2;
        Integer int3 = 56;
        Integer int4 = 21;
        Integer int5 = 63;
        treeTest.add(int1, 1);
        treeTest.add(int2, 2);
        treeTest.add(int3, 3);
        treeTest.add(int4, 4);
        treeTest.add(int5, 5);
    }

    @Test
    public void testBasics() {
        assertEquals(5, treeTest.getSize());
    }
    
    @Test
    public void testGetPosData() {
        int[] orderArr = treeTest.getPosData();
        assertEquals(2, orderArr[0]);
        assertEquals(1, orderArr[1]);
        assertEquals(4, orderArr[2]);
        assertEquals(3, orderArr[3]);
        assertEquals(5, orderArr[4]);
    }
    
}
