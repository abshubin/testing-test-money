import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
// from http://central.maven.org/maven2/org/mockito/mockito-all/1.10.19/mockito-all-1.10.19.jar

/**
 * Created by egrstudent on 10/7/16.
 */
public class FirstMockitoTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testIfCarIsACar() {
        assertTrue(myFerrari instanceof Car);
    }

}