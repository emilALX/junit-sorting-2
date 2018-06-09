import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingAlgorithmTest {
    private SortingAlgorithms algorytm;

    @Before
    public void setUp() throws Exception {
        algorytm = new SortingAlgorithms();
    }

    @Test
    public void testAsc() throws Exception {
        double[] testArray = {2.0, 3.0, 1.0};
        boolean asc = true;
        double [] resultArray = {1.0, 2.0, 3.0};

        algorytm.sort(testArray, asc);

        for (int i = 0; i < testArray.length; ++i){
            Assert.assertEquals("Zła kolejność", resultArray[1], testArray[1], 0.0001);
        }
    }

    @Test
    public void testDesc() throws Exception {
        double[] testArray = {2.0, 3.0, 1.0};
        boolean asc = false;
        double [] resultArray = {3.0, 2.0, 1.0};

        algorytm.sort(testArray, asc);

        for (int i = 0; i < testArray.length; ++i){
            Assert.assertEquals("Zła kolejność", resultArray[1], testArray[1], 0.0001);
        }
    }

    @Test
    public void testZeros() throws Exception {
        double[] testArray = {0.0, 0.0, 0.0};
        boolean asc = false;
        double [] resultArray = {0.0, 0.0, 0,0};

        algorytm.sort(testArray, asc);

        for (int i = 0; i < testArray.length; ++i){
            Assert.assertEquals("Zła kolejność", resultArray[1], testArray[1], 0.0001);
        }
    }

}
