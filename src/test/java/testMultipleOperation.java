import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Анютка on 03.04.2015.
 */
public class testMultipleOperation {

    double[][] date = {{6, 4}, {5, 0},{9,3},{10,4},{0,5}};
    @Test
    public void testMultipleOperation()
    {
        for ( double[] number :date)
        {
            Assert.assertEquals(new Multiple().doIt(number[0], number[1]), number[0]*number[1], 1e-1);
        }
    }


}
