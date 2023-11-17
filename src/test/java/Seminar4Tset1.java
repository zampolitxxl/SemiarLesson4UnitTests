import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Iterator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class Seminar4Tset1 {

    @Test
    public  void iteratorWillReturnHelloWorld(){
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");
        String result = iteratorMock.next() + " " + iteratorMock.next();

        assertThat(result).isEqualTo("Hello  World");

    }


}
