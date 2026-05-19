import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
        double max = 0;
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = inputCollector.nextDouble();
        System.out.println("Enter Second Number");
        double secondNumber = inputCollector.nextDouble();
        if(firstNumber > secondNumber){
            max = firstNumber;    
        }
        if(secondNumber > firstNumber){
            max = secondNumber;
        }
        if(secondNumber ==firstNumber){
            max = secondNumber;
        }
        
        System.out.printf("Larger number is: %.2f.%n", max); 
        
    
    }


}
