import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Анютка on 06.04.2015.
 */
public class testDoItMethodResponse {

        @Test
        public void testDoItMethodResponse() throws CheckSignException{

            // Arrange
            Actions[] act= new Actions[1];
            act[0] = Mockito.mock(Plus.class);

            Calculator calc= new Calculator(act);

            Mockito.when(act[0].getSign()).thenReturn("+");
            //Act
            calc.getResult("+",3,4);
            //Assert
            Mockito.verify(act[0]).doIt(3,4);






    }


}
