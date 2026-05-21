import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MinToMaxTest{

    @Test
    
    public void testThatCountMinToMaxFunctionWorks(){
    MinToMax calc = new MinToMax();
    int[] array = {14, 9, 6, 5, 8, 10};
    int[] actual = MinToMax.countMinToMax(array);
    int[] expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    assertArrayEquals(actual, expected);
    }
    
    










}
