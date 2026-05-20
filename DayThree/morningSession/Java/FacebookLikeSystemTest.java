import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FacebookLikeSystemTest{

    @Test
    
    public void testThatZeroLikesdisplayTheRightMessage(){
    FacebookLikeSystem like = new FacebookLikeSystem();
    String[] array = {};
    String actual = FacebookLikeSystem.likeMessage(array);
    String expected = "no one likes this";
    assertEquals(actual, expected);
    }


    @Test
    
    public void testThatOnelikesDisplayTheRightMessage(){
    FacebookLikeSystem like = new FacebookLikeSystem();
    String[] array = {"vin"};
    String actual = FacebookLikeSystem.likeMessage(array);
    String expected = "vin likes this";
    assertEquals(actual, expected);
    }    

     @Test
    
    public void testThatTwolikesDisplayTheRightMessage(){
    FacebookLikeSystem like = new FacebookLikeSystem();
    String[] array = {"vin", "Bola"};
    String actual = FacebookLikeSystem.likeMessage(array);
    String expected = "vin and Bola like this";
    assertEquals(actual, expected);
    }    
    
    
    @Test
    
    public void testThatThreelikesDisplayTheRightMessage(){
    FacebookLikeSystem like = new FacebookLikeSystem();
    String[] array = {"vin", "Bola", "Joy"};
    String actual = FacebookLikeSystem.likeMessage(array);
    String expected = "vin, Bola and 2 others like this";
    assertEquals(actual, expected);
    }    
    
    
    @Test
    
    public void testThatFourlikesDisplayTheRightMessage(){
    FacebookLikeSystem like = new FacebookLikeSystem();
    String[] array = {"vin", "Bola", "Joy", "Ben"};
    String actual = FacebookLikeSystem.likeMessage(array);
    String expected = "vin, Bola and 2 others like this";
    assertEquals(actual, expected);
    }    



}


