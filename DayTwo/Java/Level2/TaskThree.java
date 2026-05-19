import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Score");
        int score = inputCollector.nextInt();
        if(score >= 50){
            System.out.println("Pass");    
        }
        else{
            System.out.println("Fail");   
        }
        
    
    }


}
