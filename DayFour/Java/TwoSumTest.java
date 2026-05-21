import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TwoSumTest{

    @Test
    
    public void testIPassAnArrayAndANumberAndItGivesMeNumbersThatSumToGivenNumber(){
    TwoSum calc = new TwoSum();
    int[] array = {2,5,6,7,-6};
    int number = 8;
    int[] actual = TwoSum.getNumbers(array, number);
    int[] expected = {2, 6};
    assertArrayEquals(actual, expected);
    }
    
    @Test
    
    public void testIPassAnArrayAndANumberAndItGivesMeNumbersThatSumToGivenNumberAgain(){
    TwoSum calc = new TwoSum();
    int[] array = {2,5,6,3,-6};
    int number = 8;
    int[] actual = TwoSum.getNumbers(array, number);
    int[] expected = {2, 6};
    assertArrayEquals(actual, expected);
    }
}






