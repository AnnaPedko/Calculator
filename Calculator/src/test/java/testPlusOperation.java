import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Анютка on 01.04.2015.
 */

public class testPlusOperation {

    double[][] date = {{6, 4}, {5, 0},{9,3},{10,4},{0,5}};
    @Test
    public void testPlusOperation(){
        for ( double[] number :date){
            Assert.assertEquals(new Plus().doIt(number[0], number[1]), number[0] + number[1], 1e-1);
        }}

}