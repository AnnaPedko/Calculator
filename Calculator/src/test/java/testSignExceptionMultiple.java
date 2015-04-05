import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by User on 02.04.2015.
 */
public class testSignExceptionMultiple {

//Arrange
@Test (expected = CheckSignException.class)

public void testGetSignMethodForMultipleWithException() throws CheckSignException{
 // Arrange
    Actions[] act= new Actions[1];
    act[0] = Mockito.mock(Multiple.class);

    Calculator calc= new Calculator(act);
    Mockito.when(act[0].getSign()).thenReturn("*");
    //Act
    calc.getResult("-",3,4);
    //Assert
    Mockito.verify(act[0]).getSign();

}



}
