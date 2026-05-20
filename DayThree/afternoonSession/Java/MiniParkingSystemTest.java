import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MiniParkingSystemTest{


    @Test
    
    public void testThatTheGetParkingStatusGivesTheCorrectStatus(){
        MiniParkingSystem check = new MiniParkingSystem();
        int[] actual = MiniParkingSystemTest.parkingLot;
        int[] expected = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(actual, expected);
    }
    
    
    @Test
    
    public void testThatTheEnterinGivesTheCorrectStatus(){
        entering(int[] parkingLot)
        MiniParkingSystem check = new MiniParkingSystem();
        int[] actual = check.getParkingStatus();
        int[] expected = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(actual, expected);
    }
    
    
    @Test
    
    public void testThatTheLeavingGivesTheCorrectStatus(){
        MiniParkingSystem check = new MiniParkingSystem();
        int[] actual = check.getParkingStatus();
        int[] expected = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(actual, expected);
    }


}





//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out FacebookLikeSystemTest.java FacebookLikeSystem.java

//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

