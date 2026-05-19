import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = inputCollector.nextInt();
        if(number > 0){
            System.out.println("Positive");    
        }
        else if(number < 0){
            System.out.println("Negative");     
        }
        else{
            System.out.println("Zero");   
        }
        
    
    }


}
