import org.junit.Test;
import org.mockito.Mockito;
/**
 * Created by Анютка on 04.04.2015.
 */
public class testGetInfo {
    @Test
    public void testGetInfo(){

        // Arrange
        Actions[] act= new Actions[1];
        act[0] = Mockito.mock(Plus.class);

        Calculator calc= new Calculator(act);
        String expectedText = "Should be text \"operation \"+\" displays the sum of two numbers\"";
        Mockito.when(act[0].getInfo()).thenReturn(expectedText);
        //Act
        System.out.println(calc.help());
        //Assert
        Mockito.verify(act[0]).getInfo();


    }



}







