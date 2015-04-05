import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 02.04.2015.
 */
public class testDivideOperation {
    double[][] date = {{6, 4}, {5, 0},{9,3},{10,4},{0,5}};
    @Test
    public void testDivideOperation ()
    {
        for (double[] number : date) {
            Assert.assertEquals(new Divide().doIt(number[0], number[1]), number[0] / number[1], 1e-1);
        }
    }
}
