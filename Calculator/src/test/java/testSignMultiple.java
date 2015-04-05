import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Анютка on 03.04.2015.
 */
public class testSignMultiple {
    @Test

    public void testGetSignMethodForMultiple() throws CheckSignException{
        // Arrange
        Actions[] act= new Actions[1];
        act[0] = Mockito.mock(Multiple.class);
        Calculator calc= new Calculator(act);
        Mockito.when(act[0].getSign()).thenReturn("*");
        //Act
        calc.getResult("*",3,4);
        //Assert
        Mockito.verify(act[0]).getSign();


    }




}
